package com.ifp.common.model.mqmessage;

import com.ifp.common.constant.MQName;
import com.ifp.common.plugs.rabbitmq.message.annotation.MQMessage;

/**
 * restTemplate + loadbalance 远程调用
 * 
 * @author Administrator
 *
 */
@MQMessage(exchangeName = MQName.BPM.EXCHANGE, routingKey = MQName.BPM.ROUTING_KEY_REMOTE_CALL, waitConfirm = true)
public class DynamicRemoteCallMessage extends BaseMessage{

	private String serviceId;

	private String path;


	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
