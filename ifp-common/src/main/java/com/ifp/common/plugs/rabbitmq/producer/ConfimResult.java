package com.ifp.common.plugs.rabbitmq.producer;

/**
 * 发送者确认消息是否成功的数据对象。
 * @author xman
 *
 */
public class ConfimResult {

	private boolean finished;
	private String correlationId;
	private boolean ack;
	private String cause;
	
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public boolean isAck() {
		return ack;
	}
	public void setAck(boolean ack) {
		this.ack = ack;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public boolean isSuccess() {
		return finished && ack;
	}
	
}
