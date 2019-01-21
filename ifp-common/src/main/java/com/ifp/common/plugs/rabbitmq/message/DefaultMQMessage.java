package com.ifp.common.plugs.rabbitmq.message;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;

public class DefaultMQMessage implements MQMessage {

	public String getExchangeName() {
		// 默认使用rabbitTemplate配置的交换器
		return null;
	}

	public String getRoutingKey() {
		// 默认使用rabbitTemplate配置的路由键
		return null;
	}

	public Message postProcessMessage(Message message) {
		MessageProperties properties = message.getMessageProperties();
		// 默认所有消息都要持久化
		properties.setDeliveryMode(MessageDeliveryMode.PERSISTENT);
		return message;
	}

	public String getCorrelationId() {
		// 默认相关联ID为空
		return null;
	}

	@Override
	public void setCorrelationId(String id) {
		
	}
	
}
