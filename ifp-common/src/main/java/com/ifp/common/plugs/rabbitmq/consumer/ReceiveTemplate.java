package com.ifp.common.plugs.rabbitmq.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.ifp.common.exception.ArchException;
import com.ifp.common.exception.BusinessException;

/**
 * 目前配置采用自动模式。
 * 如果消息成功被消费（成功的意思是在消费的过程中没有抛出异常），则自动确认
 * 当抛出 AmqpRejectAndDontRequeueException 异常的时候，则消息会被拒绝，且 requeue = false（不重新入队列）
 * 当抛出 ImmediateAcknowledgeAmqpException 异常，则消费者会被确认
 * 其他的异常，则消息会被拒绝，且 requeue = true（如果此时只有一个消费者监听该队列，则有发生死循环的风险，
 * 多消费端也会造成资源的极大浪费，这个在开发过程中一定要避免的）。
 * 可以通过 setDefaultRequeueRejected（默认是true）去设置。
 * ---- 
 * 目前全部使用AmqpRejectAndDontRequeueException，配置死信队列。 
 * @author xman
 *
 */
public class ReceiveTemplate implements ApplicationContextAware {
	
	private Logger log = LoggerFactory.getLogger(ReceiveTemplate.class);
	
	private ApplicationContext applicationContext;
	
	@SuppressWarnings("unchecked")
	public <T, U, R> void dispose(BiiFunction<T, U, R> f, Class<T> t, U u, Supplier<R> r) {
		T bean = getBean(t);
		CustomeResult result = ((CustomeResult) r.get()).fail();
		try {
			result = (CustomeResult) f.apply(bean, u, (R) result);
		} catch(ArchException e) {
			log.error("消费者架构封装异常", e);
			throw new AmqpRejectAndDontRequeueException(e);
		} catch(BusinessException e) {
			log.info("消费者主动拒绝消息 - {}", e.getMessage());
			throw new AmqpRejectAndDontRequeueException(e);
		} catch(Exception e) {
			log.error("消费者执行异常", e);
			throw new AmqpRejectAndDontRequeueException(e);
		}
		if(result != null) {
			if(!result.isSuccess()) {
				throw new AmqpRejectAndDontRequeueException("消息未被正确消费.");
			}
		} else {
			log.error("必须返回CustomeResult对象，标记处理结果!!!");
		}
		
	}
	
	/**
	 * 调用回调方法，回调方法必须包含可映射队列中JSON的对象为参数。
	 * 例如：public void getUser(User user) {}
	 * @param f 函数接口
	 * @param t 待调用对象class
	 * @param u 调用方法参数
	 */
	public <T, U> void dispose(BiConsumer<T, U> f, Class<T> t, U u) {
		T bean = getBean(t);
		try {
			f.accept(bean, u);
		} catch(ArchException e) {
			log.error("消费者架构封装异常", e);
			throw new AmqpRejectAndDontRequeueException(e);
		} catch(BusinessException e) {
			log.info("消费者主动拒绝消息 - {}", e.getMessage());
			throw new AmqpRejectAndDontRequeueException(e);
		} catch(Exception e) {
			log.error("消费者执行异常", e);
			throw new AmqpRejectAndDontRequeueException(e);
		}
	}
	
	public <T> void dispose(Consumer<T> f, Class<T> t) {
		T bean = getBean(t);
		try {
			f.accept(bean);
		} catch(ArchException e) {
			log.error("消费者架构封装异常", e);
			throw new AmqpRejectAndDontRequeueException(e);
		} catch(BusinessException e) {
			log.info("消费者主动拒绝消息 - {}", e.getMessage());
			throw new AmqpRejectAndDontRequeueException(e);
		} catch(Exception e) {
			log.error("消费者执行异常", e);
			throw new AmqpRejectAndDontRequeueException(e);
		}
	}
	
	/**
	 * 在spring中发现bean。
	 * @param t
	 * @return
	 */
	private <T> T getBean(Class<T> t) {
		try {
			return applicationContext.getBean(t);
		} catch(Exception e) {
			log.error("因无法找到消费者Bean，拒绝消息.", e);
			throw new AmqpRejectAndDontRequeueException(e);
		}
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
}
