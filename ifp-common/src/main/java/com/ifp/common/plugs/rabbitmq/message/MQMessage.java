package com.ifp.common.plugs.rabbitmq.message;

import org.springframework.amqp.core.Message;

/**
 * 一条发往MQ中的消息。
 * @author xman
 *
 */
public interface MQMessage {

	/**
	 * 提供交换器名称
	 * @return
	 */
	public String getExchangeName();
	
	/**
	 * 提供路由键
	 * @return
	 */
	public String getRoutingKey();
	
	/**
	 * 消息后置处理方法
	 * @param message
	 * @return
	 */
	public Message postProcessMessage(Message message);
	
	/**
	 * 消息关联ID
	 * @return
	 */
	//default 
	public String getCorrelationId();
	/**
	 * 主动设置关联ID
	 * @param id
	 */
	//default 
	public void setCorrelationId(String id);
	
}
