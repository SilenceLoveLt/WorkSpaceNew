package com.ifp.common.model.mqmessage;

import com.ifp.common.constant.MQName;
import com.ifp.common.plugs.rabbitmq.message.annotation.MQMessage;

/**
 *
 */
@MQMessage(exchangeName = MQName.PAPER.EXCHANGE, routingKey = MQName.PAPER.ROUTING_KEY_DEALDATA, waitConfirm = true)
public class PaperDealDataMessage extends BaseMessage {

	/** 投保流程处理告知 税收声明结果的消息,为了防止批量插入造成并发锁表问题,结果表只允许使用此消息类,使用msgType区分消息类型 **/
	private String msgType;

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

}
