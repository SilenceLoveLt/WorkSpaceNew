/*
 * Copyright 2018 www.n22.com.cn
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ifp.common.model;

import com.ifp.common.constant.Constant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>ResponseObj的泛型版本。
 * <p>当底层使用JSON等传输技术时，可以和ResponseObj自由转换，但是在获取内部数据对象时无需使用
 * 强制类型转换，并且添加了几个扩展方法。
 * @see ResponseObj
 * @author xman 2018-12-28
 */
@ApiModel(description = "响应对象")
public class ResponseDTO<T> {

	public static final String MSG_SUCCESS = "操作成功";
	public static final String MSG_FAIL = "操作失败";
	
	@ApiModelProperty(value = "响应业务数据")
	private T responseData;
	
	@ApiModelProperty(value = "响应code")
    private String responseCode;

    @ApiModelProperty(value = "响应message",example = "操作成功")
    private String responseMsg;

	@ApiModelProperty(value = "响应接口名",example = "XX接口",hidden = true)
	private String functionName;

	@ApiModelProperty(value = "响应接口码值",example = "INTERFACECODE",hidden = true)
	private String functionCode;

	/**
	 * 完全体的创建。
	 * @param data
	 * @param respCode
	 * @param respMsg
	 * @param funcName
	 * @param funcCode
	 * @return
	 */
	public static <T> ResponseDTO<T> create(T data, String respCode, String respMsg, String funcName, String funcCode) {
		ResponseDTO<T> dto = create(funcName, funcCode);
		dto.setResponseData(data);
		dto.setResponseCode(respCode);
		dto.setResponseMsg(respMsg);
		return dto;
	}
	
	/**
	 * 构建包含func信息的DTO。
	 * @param funcName
	 * @param funcCode
	 * @return
	 */
	public static <T> ResponseDTO<T> create(String funcName, String funcCode) {
		ResponseDTO<T> dto = create();
		dto.setFunctionName(funcName);
		dto.setFunctionCode(funcCode);
		return dto;
	}
	
	/**
	 * 新建DTO。
	 * @return
	 */
	public static <T> ResponseDTO<T> create() {
		return new ResponseDTO<T>();
	}
	
	/**
	 * 单纯设置func。
	 * @param funcName
	 * @param funcCode
	 * @return
	 */
	public ResponseDTO<T> func(String funcName, String funcCode) {
		setFunctionName(funcName);
		setFunctionCode(funcCode);
		return this;
	}
	
	/**
	 * 标记为成功，并设置数据、func。
	 * @param data
	 * @param funcName
	 * @param funcCode
	 * @return
	 */
	public ResponseDTO<T> success(T data, String funcName, String funcCode) {
		return success(data).func(funcName, funcCode);
	}
	
	/**
	 * 标记为成功，设置数据。
	 * @param data
	 * @return
	 */
	public ResponseDTO<T> success(T data) {
		success().setResponseData(data);
		return this;
	}
	
	/**
	 * 单纯标记为成功，注意：此方法清空了数据。
	 * @return
	 */
	public ResponseDTO<T> success() {
		setResponseCode(Constant.SYS_CONSTANT_0);
		setResponseMsg(MSG_SUCCESS);
		return this;
	}
	
	/**
	 * 标记为失败，可自定义错误码，并设置错误信息、func。
	 * @param respCode
	 * @param msg
	 * @param funcName
	 * @param funcCode
	 * @return
	 */
	public ResponseDTO<T> fail(String respCode, String msg, String funcName, String funcCode) {
		return fail(respCode, msg).func(funcName, funcCode);
	}
	
	/**
	 * 标记为失败，可自定义错误码，设置错误信息。
	 * @param respCode
	 * @param msg
	 * @return
	 */
	public ResponseDTO<T> fail(String respCode, String msg) {
		setResponseCode(respCode);
		setResponseMsg(msg);
		return this;
	}
	
	/**
	 * 标记为失败，可设置错误信息。
	 * @param msg
	 * @return
	 */
	public ResponseDTO<T> fail(String msg) {
		fail().setResponseMsg(msg);
		return this;
	}
	
	/**
	 * 直接失败
	 * @return
	 */
	public ResponseDTO<T> fail() {
		setResponseCode(Constant.RESPONSE_ERROR_KEY_CODE1000);
		setResponseMsg(MSG_FAIL);
		return this;
	}
	
	/**** 静态方法 ****/
	
	public static <T> ResponseDTO<T> successc(T data, String funcName, String funcCode) {
		return create(data, Constant.SYS_CONSTANT_0, MSG_SUCCESS, funcName, funcCode);
	}
	
	public static <T> ResponseDTO<T> successc(T data) {
		return successc(data, "", "");
	}
	
	public static <T> ResponseDTO<T> failc(String msg, String funcName, String funcCode) {
		return create(null, Constant.RESPONSE_ERROR_KEY_CODE1000, msg, funcName, funcCode);
	}
	
	public static <T> ResponseDTO<T> failc(String funcName, String funcCode) {
		return failc(MSG_FAIL, funcName, funcCode);
	}
	
	public static <T> ResponseDTO<T> failc(String msg) {
		return failc(msg, "", "");
	}
	
	public static <T> ResponseDTO<T> failc() {
		return failc("", "");
	}
	
	/**** 其他方法 ****/
	
	public boolean isSuccess() {
		return responseCode != null && Constant.SYS_CONSTANT_0.equals(responseCode); 
	}
	
	public boolean isSuccess(String code) {
		return code != null && code.equals(responseCode); 
	}
	
	public T getResponseData() {
		return responseData;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public String getFunctionName() {
		return functionName;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setResponseData(T responseData) {
		this.responseData = responseData;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}
	
}
