package com.ifp.common.plugs.rabbitmq;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ifp.common.plugs.rabbitmq.MQUtils;
import com.ifp.common.plugs.rabbitmq.producer.FastJsonMessageConverter;
import com.ifp.common.plugs.rabbitmq.producer.PublisherConfirmCallback;
import com.ifp.common.plugs.rabbitmq.producer.PublisherReturnCallback;

@Configuration
public class MQConfiguration {
	
	//private Logger log = LoggerFactory.getLogger(MQConfiguration.class);
	
	@Value("${spring.rabbitmq.publisher-confirms}")
	private boolean publisherConfirms;
	@Value("${spring.rabbitmq.publisher-returns}")
	private boolean publisherReturns;
	
	// 发送
	
	@Bean
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		RabbitTemplate rt = new RabbitTemplate();
		rt.setConnectionFactory(connectionFactory);
		if(publisherConfirms) {
			rt.setConfirmCallback(publisherConfirmCallback());
		}
		if(publisherReturns) {
			rt.setReturnCallback(publisherReturnCallback());
		}
		rt.setMessageConverter(new FastJsonMessageConverter());
		return rt;
	}
	
	@Bean
	public MQUtils mqUtils(RabbitTemplate rabbitTemplate) {
		MQUtils util = new MQUtils();
		util.setTemplate(rabbitTemplate);
		return util;
	}
	
	@Bean
	@ConditionalOnProperty(name = "spring.rabbitmq.publisher-confirms", havingValue = "true")
	public PublisherConfirmCallback publisherConfirmCallback() {
		return new PublisherConfirmCallback();
	}
	
	@Bean
	@ConditionalOnProperty(name = "spring.rabbitmq.publisher-returns", havingValue = "true")
	public PublisherReturnCallback publisherReturnCallback() {
		return new PublisherReturnCallback();
	}
	
}

