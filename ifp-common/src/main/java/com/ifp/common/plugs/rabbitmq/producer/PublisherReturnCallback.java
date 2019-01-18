package com.ifp.common.plugs.rabbitmq.producer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import com.ifp.common.exception.ArchException;

public class PublisherReturnCallback implements RabbitTemplate.ReturnCallback {

	public PublisherReturnCallback() {
		throw new ArchException("架构不使用此方式，使用后备队列（AE）。");
	}
	
	@Override
	public void returnedMessage(Message message, int replyCode, String replyText, 
			String exchange, String routingKey) {
		
	}

}
