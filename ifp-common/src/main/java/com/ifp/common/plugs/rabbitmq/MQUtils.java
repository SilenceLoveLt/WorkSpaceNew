package com.ifp.common.plugs.rabbitmq;

import java.lang.annotation.Annotation;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

import com.ifp.common.exception.InterruptedRException;
import com.ifp.common.plugs.rabbitmq.message.MQMessage;
import com.ifp.common.plugs.rabbitmq.message.SyncedPublishConfirmMessage;
import com.ifp.common.plugs.rabbitmq.producer.ConfimResult;
import com.ifp.common.utils.UUIDGenerator;

/**
 * MQ消息发送的工具类。
 * @author xman
 *
 */
public class MQUtils {

	private static Logger log = LoggerFactory.getLogger(MQUtils.class);
	private static MQUtils mq;
	private ConcurrentHashMap<String, Exchanger<ConfimResult>> waiter = new ConcurrentHashMap<String, Exchanger<ConfimResult>>();
	private RabbitTemplate template;
	
	public MQUtils() {
		mq = this;
	}
	
	/**
	 * 发送消息，支持带有MQMessage注解的POJO对象消息，若不带注解，使用默认属性。
	 * @see com.ifp.common.plugs.rabbitmq.message.annotation.MQMessage
	 * @param t
	 * @return
	 */
	public static <T> ConfimResult send(T t) {
		if(t == null) {
			throw new IllegalArgumentException("消息不能为空.");
		}
		// 默认发送属性
		String exchangeName = null;
		String routingKey = null;
		boolean durable = false;
		boolean waitConfirm = false;
		long waitConfirmTime = 5000l;
		// 从注解中覆盖默认值
		Class<? extends Annotation> annoType = com.ifp.common.plugs.rabbitmq.message.annotation.MQMessage.class;
		if(t.getClass().isAnnotationPresent(annoType)) {
			com.ifp.common.plugs.rabbitmq.message.annotation.MQMessage anno = 
					(com.ifp.common.plugs.rabbitmq.message.annotation.MQMessage) t.getClass().getAnnotationsByType(annoType)[0];
			exchangeName = StringUtils.isNotBlank(anno.exchangeName())?anno.exchangeName():null;
			routingKey = StringUtils.isNotBlank(anno.routingKey())?anno.routingKey():null;
			durable = anno.durable();
			waitConfirm = anno.waitConfirm();
			waitConfirmTime = anno.waitConfirmTime();
		}
		// 设置持久化策略
		MessagePostProcessor post = null;
		if(durable) {
			post = m -> {
				MessageProperties properties = m.getMessageProperties();
				properties.setDeliveryMode(MessageDeliveryMode.PERSISTENT);
				return m;
			};
		} else {
			post = m -> { return m; };
		}
		// 设置关联ID，暂时不支持自定义，目前看来基本用不到自定义
		String correlationId = null;
		if(waitConfirm) {
			correlationId = UUIDGenerator.create32Key();
		}
		return sendMessage(t, exchangeName, routingKey, post, waitConfirm, waitConfirmTime, correlationId);
	}
	
	/**
	 * 发送消息至MQ。
	 * @param message
	 * @return
	 */
	public static ConfimResult send(MQMessage message) {
		if(message == null) {
			throw new IllegalArgumentException("消息不能为空.");
		}
		String correlationId = null;
		boolean wait = mq.isWaiting(message);
		long time = 5000l;
		if(wait) {
			time = ((SyncedPublishConfirmMessage) message).waitConfirmTime();
			if((correlationId = message.getCorrelationId()) == null) {
				// 验证是否有关联ID
				correlationId = UUIDGenerator.create32Key();
				message.setCorrelationId(correlationId);
			}
		}
		return sendMessage(message, message.getExchangeName(), message.getRoutingKey(), message::postProcessMessage,
				wait, time, correlationId);
	}
	
	/**
	 * 由我来发送消息
	 * @param obj
	 * @param exchangeName
	 * @param routingKey
	 * @param durable
	 * @param waitConfirm
	 * @param waitConfirmTime
	 * @param correlationId
	 * @return
	 */
	private static ConfimResult sendMessage(Object obj, String exchangeName, String routingKey,
			MessagePostProcessor post, boolean waitConfirm, long waitConfirmTime, String correlationId) {
		if(exchangeName != null && routingKey != null) {
			// 如果手动指定交换器和路由键
			mq.template.convertAndSend(exchangeName, routingKey, obj, post, mq.newCorrelationData(correlationId));
		} else if(exchangeName == null && routingKey == null) {
			// 如果未手动指定交换器和路由键，使用模板默认
			mq.template.convertAndSend(obj, post);
		} else if(exchangeName == null) {
			// 如果手动指定路由键，交换器使用默认
			mq.template.convertAndSend(routingKey, obj, post, mq.newCorrelationData(correlationId));
		} else {
			// 缺少路由键
			throw new IllegalArgumentException("消息交换器或者路由键不明确.");
		}
		ConfimResult data = new ConfimResult();
		if(waitConfirm) {
			// 如果消息需要等待，放入集合，等待
			try {
				try {
					Exchanger<ConfimResult> exchanger = new Exchanger<ConfimResult>();
					mq.waiter.put(correlationId, exchanger);
					if(waitConfirmTime == -1l) {
						data = exchanger.exchange(null);
					} else {
						data = exchanger.exchange(null, waitConfirmTime, TimeUnit.MILLISECONDS);
					}
				} finally {
					mq.waiter.remove(correlationId);
				}
			} catch (InterruptedException e) {
				// 感觉此处有坑哪.
				log.error("MQ等待线程被强行中断.", e);
				throw new InterruptedRException(e);
			} catch (TimeoutException e) {
				log.warn("MQ等待线程超时.", e);
			}
		}
		return data;
	}
	
	/**
	 * 消息回调监听接收到请求，发送回原线程。
	 * @param id
	 * @param ack
	 * @param cause
	 */
	public static boolean fireConfirm(String id, boolean ack, String cause) {
		boolean isConfirm = false;
		if(StringUtils.isNotBlank(id)) {
			isConfirm = true;
			Exchanger<ConfimResult> exchanger = mq.waiter.get(id);
			if(exchanger != null) {
				ConfimResult data = new ConfimResult();
				data.setFinished(true);
				data.setCorrelationId(id);
				data.setAck(ack);
				data.setCause(cause);
				try {
					exchanger.exchange(data);
				} catch (InterruptedException e) {
					log.error("MQ等待线程被强行中断.", e);
				} finally {
					mq.waiter.remove(id);
				}
			}
		}
		return isConfirm;
	}
	
	private CorrelationData newCorrelationData(String id) {
		return id == null? null : new CorrelationData(id);
	}
	
	/**
	 * 判断消息是否使用同步等待.
	 * @param message
	 * @return
	 */
	private boolean isWaiting(MQMessage message) {
		Class<?>[] interfaces = message.getClass().getInterfaces();
		if(interfaces != null && interfaces.length > 0) {
			for(Class<?> klass : interfaces) {
				if(klass == SyncedPublishConfirmMessage.class) {
					return true;
				}
			}
		}
		return false;
	}

	public RabbitTemplate getTemplate() {
		return template;
	}

	public void setTemplate(RabbitTemplate template) {
		this.template = template;
	}
	
}
