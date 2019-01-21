package com.ifp.common.plugs.rabbitmq.consumer;

/**
 * 消息消费结果。
 * @author xman
 *
 */
public class CustomeResult {

	private static final boolean SUCCESS = true;
	private static final boolean FAIL = false;
	
	private boolean status;
	
	public CustomeResult success() {
		this.status = SUCCESS;
		return this;
	}
	
	public CustomeResult fail() {
		this.status = FAIL;
		return this;
	}
	
	public boolean isSuccess() {
		return this.status;
	}
	
}
