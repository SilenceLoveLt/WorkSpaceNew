package com.ifp.common.model;

import java.io.Serializable;


public class Header implements Serializable {
	private static final long serialVersionUID = 5869518853637687126L;
	
	private String returnUrl;
	// 交易类型(必填) 
	private String requestType;
	
	// 是否成功(必填)
	private String responseCode;
	
	// 错误信息(非必填)
	private String errorMessage;
	
	// 唯一编码(必填) 
	private String uuId;
	
	// 交互保险公司编码(必填) 
	private String comId;
	
	// 发送方编号(必填) 
	private String from;
	
	// 发送时间(必填)
	private String sendTime;
	
	// 发送日期
	private String sendDate;
	
	// 交易流水号(必填) 
	private String orderSerial;
	
	// 万能险保险平台交易流水号(必填) 
	private String WNSerial;
	
	//是否异步
	private String asyn;
	
	private String productCode;	
	//访问目标渠道
	private String tagChannel;
	//token授权
	private String tokenCode;
	//终端所属渠道
	private String deviceType;
	//终端序列号
	private String deviceNo;
	
	private String openId;;
	
	public String getTagChannel() {
		return tagChannel;
	}

	public void setTagChannel(String tagChannel) {
		this.tagChannel = tagChannel;
	}

	public String getTokenCode() {
		return tokenCode;
	}

	public void setTokenCode(String tokenCode) {
		this.tokenCode = tokenCode;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getAsyn() {
		return asyn;
	}

	public void setAsyn(String asyn) {
		this.asyn = asyn;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	
	
	public String getOrderSerial() {
		return orderSerial;
	}

	public void setOrderSerial(String orderSerial) {
		this.orderSerial = orderSerial;
	}

	public String getWNSerial() {
		return WNSerial;
	}

	public void setWNSerial(String WNSerial) {
		this.WNSerial = WNSerial;
	}

	public String getComSerial() {
		return comSerial;
	}

	public void setComSerial(String comSerial) {
		this.comSerial = comSerial;
	}

	//保险公司流水号(非必填)
	private String comSerial;
	
	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
}
