package com.ifp.common.model.mqmessage;

import java.util.Date;

import com.ifp.common.constant.MQName;
import com.ifp.common.plugs.rabbitmq.message.annotation.MQMessage;

@MQMessage(exchangeName = MQName.INS.EXCHANGE, routingKey = MQName.INS.ROUTING_KEY_TEST, waitConfirm = true)
public class MQTestMessage {

	private Integer id;
	private String name;
	private Date time;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
}
