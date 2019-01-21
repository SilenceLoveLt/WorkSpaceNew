package com.ifp.common.plugs.rabbitmq.consumer;

/**
 * 函数接口，处理消息监听方法回调。
 * @author xman
 *
 * @param <T>
 * @param <U>
 * @param <R>
 */
public interface BiiFunction<T, U, R> {

	public R apply(T t, U u, R r);
	
//	default Class<T> getTClass() {
//		return null;
//	}
// ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0].getTypeName()
}
