package com.ifp.common.plugs.rabbitmq.message.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 被该注解标记的POJO均认为是一条发往MQ中的消息。
 * @author xman
 *
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface MQMessage {
	
	/**
	 * 交换器名称，默认空
	 * @return
	 */
	String exchangeName() default "";
	
	/**
	 * 路由键，默认空
	 * @return
	 */
	String routingKey() default "";
	
	/**
	 * 是否持久化，默认持久化
	 * @return
	 */
	boolean durable() default true;
	
	/**
	 * 是否等待消息被确认，默认不等待
	 * @return
	 */
	boolean waitConfirm() default false;
	
	/**
	 * 如果等待，等多久？默认5s，-1为无限等待
	 * @return
	 */
	long waitConfirmTime() default 5000l;
	
}
