package com.ifp.common.model;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.google.gson.Gson;

/**
 * 调用结果类�?�该类可以在很多场景用到，一个类调用另一个类时可以用Result来传递调用结�?
 *
 * 默认�? successed �? true;

 */

@SuppressWarnings("serial")
public class Result implements Serializable {

	/**
	 * 是否成功，默认执行成�?(必填)
	 */
	private boolean successed = true;

	/**
	 * 消息，不论是否成功都可以写入消息(选填�?
	 */
	private String message = "";

	/**
	 * 返回数据 用于可扩展的返回信息(选填)
	 */
	private Object data = null;

	/**
	 * 创建成功结果
	 *
	 * @param key
	 * @param value
	 * @return
	 */
	public static Result createSuccessResult() {
		Result result = new Result();
		result.setSuccessed(true);
		return result;
	}

	/**
	 * 创建成功结果
	 *
	 * @param dataMap
	 *            返回数据map
	 * @return
	 */
	public static Result createSuccessResult(Object object) {
		Result result = new Result();
		result.setSuccessed(true);
		result.setData(object);
		return result;
	}

	/**
	 * 创建失败结果
	 *
	 * @param errorMessage
	 *            错误消息
	 * @return
	 */
	public static Result createErrorResult(String message) {
		Result result = new Result();
		result.setSuccessed(false);
		result.setMessage(message);
		return result;
	}

	public static Result createErrorResult() {
		Result result = new Result();
		result.setSuccessed(false);
		return result;
	}

	public static Result fromJsonString(String json) {
		return new Gson().fromJson(json, Result.class);
	}

	/**
	 * 转换为json字符�?
	 *
	 * @return
	 */
	public String toJsonString() {
		return new Gson().toJson(this);
	}

	public boolean isSuccessed() {
		return successed;
	}

	public void setSuccessed(boolean successed) {
		this.successed = successed;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String permissionIds) {
		this.message = permissionIds;
	}

	@Override
	public String toString() {
		if (successed) {
			if (StringUtils.isEmpty(message)) {
				return "成功";
			} else {
				return "成功" + this.getMessage();
			}
		} else {
			return "失败�?" + this.getMessage();
		}
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
