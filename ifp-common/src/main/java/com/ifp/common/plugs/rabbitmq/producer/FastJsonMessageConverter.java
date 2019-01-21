package com.ifp.common.plugs.rabbitmq.producer;

import java.io.IOException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.support.converter.AbstractJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConversionException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

public class FastJsonMessageConverter extends AbstractJsonMessageConverter {

	@Override
	protected Message createMessage(Object object, MessageProperties messageProperties) {
		byte[] bytes;
		try {
			String jsonString = null;
			if(object instanceof String) {
				jsonString = (String) object;
			} else {
				SimplePropertyPreFilter spp = new SimplePropertyPreFilter(object.getClass());
				spp.getExcludes().add("exchangeName");
				spp.getExcludes().add("routingKey");
				spp.getExcludes().add("correlationId");
				
				jsonString = JSON.toJSONString(object, spp);
			}
			bytes = jsonString.getBytes(getDefaultCharset());
		} catch (IOException e) {
			throw new MessageConversionException("Failed to convert Message content", e);
		}
		messageProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);
		messageProperties.setContentEncoding(getDefaultCharset());
		messageProperties.setContentLength(bytes.length);
		return new Message(bytes, messageProperties);
	}

	@Override
	public Object fromMessage(Message message) throws MessageConversionException {
		
		return null;
	}

}
