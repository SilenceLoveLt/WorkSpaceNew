package com.ifp.common.model;

import java.io.Serializable;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ELK日志采集对象 
 * @auther wuxiaoyi
 * @date $date$ $time$
 */
public class LogCollectObj  implements Serializable {
	
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -4216301513793810891L;

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
	 * loginType
	 */
	private String  loginType;
	
	/**
	 * 操作人工号
	 */
	private String  loginCode;
	
	
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
	 * 主键
	 */
	private String id;
	/**
	 * request请求ID
	 */
	private String requestSerialid;
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
	 * 响应时间
	 */
	private String responseTime;
	/**
	 * 响应服务器IP
	 */
	private String responseAdress;
	/**
	 * 请求类型代码:如LOGIN
	 */
	private String requestType="";
	
	/**
	 * 请求报文
	 */
	private String requestMessage;
	/**
	 * 响应报文
	 */
	private String responseMessage;
	
    /*功能代码*/
    private  String functionCode;
    /*功能名称*/
    private  String functionName;
    /*处理耗时*/
    private  long processingTime;
    /*处理结果代码*/
    private  String resultCode;
    /*处理结果返回信息*/
    private  String resultMsg;
    /*操作人代码*/
    private  String operatorCode;
    /*终端渠道代码*/
    private  String channel;
    /*目标渠道代码*/
    private  String tagChannel;
    /*终端设备类型*/
    private  String deviceType;
    
    /*机构代码*/
    private  String orgId;
    /*终端设备序列号*/
    private  String deviceNo;
    /*终端操作坐标经度*/
    private  String longitude;
    /*终端操作坐标纬度度*/
    private  String latitude;
    /*终端OPENID*/
    private  String openId;
    /*终端授权码*/
    private  String tokenCode;

    
    
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
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
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
	public String getResponseAdress() {
		return responseAdress;
	}
	public void setResponseAdress(String responseAdress) {
		this.responseAdress = responseAdress;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public void setProcessingTime(long processingTime) {
		this.processingTime = processingTime;
	}
	@Override
    public String toString() {
		/*功能代码
		功能名称
		设备型号
		设备唯一标识id
		客户端操作系统
		操作系统版本
		网络类型
		网络运营商
		网络信号强度
		设备内存大小
		内存使用大小
		cpu使用率
		网络名称
		上传速度
		下载速度
		经度
		纬度
		请求时间
		请求报文
		响应结果
		响应报文
		响应时间
		消息内容
		响应服务器IP*/
		
        //日志格式，可封装一个对象进行复制输出：
        // 功能代码|功能名称|本次处理逻辑耗时(毫秒)|本次处理逻辑成功标识(success/fail)|本次处理逻辑提示信息(异常信息也放这里)|
        // 当前操作人代码|终端所属渠道|目标渠道|终端设备类型|终端设备序列号|
		//客户端操作系统|操作系统版本|网络类型|网络运营商|网络信号强度|
		//设备内存大小|内存使用大小|cpu使用率|网络名称|上传速度|下载速度|
		//终端操作经度|终端操作纬度|请求时间|请求报文|响应时间|响应报文|
		//|微信OPENID|tokenCode|机构ID|响应服务器IP|
        String str=this.functionCode+"|"+this.functionName+"|"+this.processingTime+"|"+this.resultCode+"|"+this.resultMsg+"|"
                +this.operatorCode+"|"+this.channel+"|"+this.tagChannel+"|"+this.deviceType+"|"+this.deviceNo+"|"
                +this.clientSystem+"|"+"|"+this.clientSystemVer+"|"+this.networkType+"|"+this.networkOperator+"|"+this.networkSignal+"|"
                +this.deviceMemorySize+"|"+this.deviceMemoryUsageSize+"|"+this.cpuUsageRate+"|"+this.networkName+"|"+this.uploadSpeed +"|"
                +this.downloadSpeed+"|"+this.longitude+"|"+this.latitude+"|"+this.requestTime+"|"+this.requestMessage+"|"+this.responseTime+"|"+this.responseMessage+"|"
                +this.openId+"|"+this.tokenCode+"|"+this.orgId+"|"+this.responseAdress+"|";

        return str;
    }
	
    public LogCollectObj(String functionCode,String functionName,long processingTime,String resultCode,String resultMsg,
                         String operatorCode, String channel,String tagChannel,String deviceType,String deviceNo,
                         String clientSystem, String clientSystemVer,String networkType,String networkOperator,String networkSignal,
                         String deviceMemorySize, String deviceMemoryUsageSize,String cpuUsageRate,String networkName,String uploadSpeed,
                         String downloadSpeed, String longitude, String latitude,String requestTime,String requestMessage,String responseTime,
                         String responseMessage,String openId,String tokenCode,String orgId,String responseAdress){
        this.functionCode=functionCode;
        this.functionName=functionName;
        this.processingTime=processingTime;
        
    	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		try {
			Date date1 = sdf.parse(responseTime);
			Date date2 = sdf.parse(requestTime);
			long ms = date1.getTime() - date2.getTime();//毫秒
			this.processingTime=ms;
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
    	
        this.resultCode=resultCode;
        this.resultMsg=resultMsg;
        this.operatorCode=operatorCode;
        this.channel= channel;
        this.tagChannel=tagChannel;
        this.deviceType=deviceType;
        this.deviceNo=deviceNo;
        this.clientSystem=clientSystem;
        this.clientSystemVer=clientSystemVer;
        this.networkType=networkType;
        this.networkOperator=networkOperator;
        this.networkSignal=networkSignal;
        this.deviceMemorySize=deviceMemorySize;
        this.deviceMemoryUsageSize=deviceMemoryUsageSize;
        this.cpuUsageRate=cpuUsageRate;
        this.networkName=networkName;
        this.uploadSpeed=uploadSpeed;
        this.downloadSpeed=downloadSpeed;
        this.requestTime=requestTime;
        this.requestMessage=requestMessage;
        this.responseTime=responseTime;
        this.responseMessage=responseMessage;
        this.longitude=longitude;
        this.latitude=latitude;
        this.openId=openId;
        this.tokenCode=tokenCode;
        this.orgId=orgId;
        String hostName = "";
		String currentIpAddress = "";
		try {
			hostName = InetAddress.getLocalHost().getHostName();
			currentIpAddress = InetAddress.getByName(hostName).getHostAddress();
		} catch (Exception e) {
			e.printStackTrace();
		}
        this.responseAdress=currentIpAddress;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public long getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTagChannel() {
        return tagChannel;
    }

    public void setTagChannel(String tagChannel) {
        this.tagChannel = tagChannel;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getTokenCode() {
        return tokenCode;
    }

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }
}
