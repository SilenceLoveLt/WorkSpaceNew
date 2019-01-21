package com.ifp.common.plugs.rabbitmq.message;

/**
 * 标记接口，实现此接口的消息要求使用消息发布确认机制；
 * 此类消息在发布后进入线程等待状态，当收到消息确认时唤醒。
 * @author xman
 *
 */
public interface SyncedPublishConfirmMessage {
	
	/**
	 * 最长等待时间，毫秒。
	 * @return
	 */
	public long waitConfirmTime();
	
}
