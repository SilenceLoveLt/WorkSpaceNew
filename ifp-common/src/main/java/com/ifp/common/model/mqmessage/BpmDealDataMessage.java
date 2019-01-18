package com.ifp.common.model.mqmessage;

import com.ifp.common.constant.MQName;
import com.ifp.common.plugs.rabbitmq.message.annotation.MQMessage;
import com.ifp.common.utils.UUIDGenerator;

/**
 * @param type
 *            操作类型 1 insert 2 update 3 del
 * @param json
 *            新增和修改有对象数据,删除为空
 * @author Administrator
 *
 */
@MQMessage(exchangeName = MQName.BPM.EXCHANGE, routingKey = MQName.BPM.ROUTING_KEY_DEALDATA, waitConfirm = true)
public class BpmDealDataMessage extends BaseMessage{

	/**
	 * 操作类型 1 insert 2 update 3 del
	 */
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
