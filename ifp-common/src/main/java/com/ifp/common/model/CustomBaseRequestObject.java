package com.ifp.common.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <P>自定义请求实体对象-公用部分属性</P>
 * @ClassName: CustomBaseRequestObject
 * @author wxy  2018年4月12日 下午6:20:22
 * @see TODO
 */
public class CustomBaseRequestObject implements Serializable {

	private static final long serialVersionUID = 143215819868736278L;
	
	/**
	 * 客户端序列号
	 */
	private String  deviceNo;
	
	/**
	 * 客户端设备类型
	 */
	private String  deviceType;
	
	/**
	 * 设备内存大小
	 */
	private String  deviceMemorySize;
	
	/**
	 * 内存使用大小
	 */
	private String  deviceMemoryUsageSize;
	
	/**
	 * cpu使用率
	 */
	private String  cpuUsageRate;
	
	/**
	 * 客户端操作系统
	 */
	private String clientSystem;
	
	/**
	 * 客户端操作系统版本号
	 */
	private String clientSystemVer;
	
	
	/**
	 * 所属渠道
	 */
	private String  channel;
	
	/**
	 * 目标所属渠道
	 */
	private String  tagChannel;
	
	/**
	 * 微信openId
	 */
	private String  openId;
	
	/**
	 * loginType
	 */
	private String  loginType;
	
	/**
	 * 操作人工号
	 */
	private String  loginCode;
	
	/*token授权码*/
	private String tokenCode;
	
	/**
	 * 网络类型
	 */
	private String networkType;  
	
	/**
	 * 网络运营商
	 */
	private String networkOperator ;
	
	/**
	 * 网络名称
	 */
	private String networkName; 
	
	/**
	 * 网络信号强度
	 */
	private String networkSignal;
	
	/**
	 * 上传速度
	 */
	private String uploadSpeed;
	 
	/**
	 * 下载速度
	 */
	private String downloadSpeed;
	/**
	 * 经度
	 */
	private String longitude ;
	/**
	 * 纬度
	 */
	private String latitude;

	/**
	 * 主键
	 */
	private String id;
	/**
	 * request请求ID
	 */
	private String requestSerialid;
	/**
	 * 业务模块代码
	 */
	private String functionCode;
	/**
	 * 同异步标识
	 */
	private String asyncFlag;

	/**
	 * 回调类型
	 */
	private String callBackType;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建人
	 */
	private String createdBy;
	/**
	 * 修改人
	 */
	private String lastUpdatedBy;
	/**
	 * 请求时间
	 */
	private String requestTime;
	
	/**
	 * 请求报文
	 */
	private String requestMessage;
	/**
	 * 响应时间
	 */
	private String responseTime;
	/**
	 * 响应报文
	 */
	private String responseMessage;
	/**
	 * 业务操作
	 */
	private String functionName;
	/**
	 * 响应服务器IP
	 */
	private String responseAdress;
	/**
	 * 请求类型代码:如LOGIN
	 */
	private String requestType="";
	
	
	public String getRequestMessage() {
		return requestMessage;
	}

	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestSerialid() {
		return requestSerialid;
	}

	public void setRequestSerialid(String requestSerialid) {
		this.requestSerialid = requestSerialid;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getAsyncFlag() {
		return asyncFlag;
	}

	public void setAsyncFlag(String asyncFlag) {
		this.asyncFlag = asyncFlag;
	}

	public String getCallBackType() {
		return callBackType;
	}

	public void setCallBackType(String callBackType) {
		this.callBackType = callBackType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getResponseAdress() {
		return responseAdress;
	}

	public void setResponseAdress(String responseAdress) {
		this.responseAdress = responseAdress;
	}

	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceMemorySize() {
		return deviceMemorySize;
	}
	public void setDeviceMemorySize(String deviceMemorySize) {
		this.deviceMemorySize = deviceMemorySize;
	}
	public String getDeviceMemoryUsageSize() {
		return deviceMemoryUsageSize;
	}
	public void setDeviceMemoryUsageSize(String deviceMemoryUsageSize) {
		this.deviceMemoryUsageSize = deviceMemoryUsageSize;
	}
	public String getCpuUsageRate() {
		return cpuUsageRate;
	}
	public void setCpuUsageRate(String cpuUsageRate) {
		this.cpuUsageRate = cpuUsageRate;
	}
	public String getClientSystem() {
		return clientSystem;
	}
	public void setClientSystem(String clientSystem) {
		this.clientSystem = clientSystem;
	}
	public String getClientSystemVer() {
		return clientSystemVer;
	}
	public void setClientSystemVer(String clientSystemVer) {
		this.clientSystemVer = clientSystemVer;
	}
	public String getTagChannel() {
		return tagChannel;
	}
	public void setTagChannel(String tagChannel) {
		this.tagChannel = tagChannel;
	}
	public String getNetworkType() {
		return networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	public String getNetworkOperator() {
		return networkOperator;
	}
	public void setNetworkOperator(String networkOperator) {
		this.networkOperator = networkOperator;
	}
	public String getNetworkName() {
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public String getNetworkSignal() {
		return networkSignal;
	}
	public void setNetworkSignal(String networkSignal) {
		this.networkSignal = networkSignal;
	}
	public String getUploadSpeed() {
		return uploadSpeed;
	}
	public void setUploadSpeed(String uploadSpeed) {
		this.uploadSpeed = uploadSpeed;
	}
	public String getDownloadSpeed() {
		return downloadSpeed;
	}
	public void setDownloadSpeed(String downloadSpeed) {
		this.downloadSpeed = downloadSpeed;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getTokenCode() {
		return tokenCode;
	}
	public void setTokenCode(String tokenCode) {
		this.tokenCode = tokenCode;
	}
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	
	
}
