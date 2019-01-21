package com.ifp.common.plugs.rabbitmq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

import com.ifp.common.plugs.rabbitmq.MQUtils;

public class PublisherConfirmCallback implements RabbitTemplate.ConfirmCallback {

	private Logger log = LoggerFactory.getLogger(PublisherConfirmCallback.class);
	
	@Override
	public void confirm(CorrelationData correlationData, boolean ack, String cause) {
		String correlationId = correlationData == null?null:correlationData.getId();
		boolean isConfirm = MQUtils.fireConfirm(correlationId, ack, cause);
		if(!isConfirm) {
			log.info("接收到消息确认：correlationId:{}, ack:{}, cause:{}.", 
					correlationId, ack, cause);
		}
	}
	
}
