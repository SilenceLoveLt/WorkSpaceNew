package com.ifp.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.ifp.common.constant.Constant;

/**
 * @description: 接口响应对象
 */
@ApiModel(description = "响应对象")
public class ResponseObj {

    @ApiModelProperty(value = "响应业务数据",example = "1")
    private Object responseData;

    @ApiModelProperty(value = "响应code",example = "0")
    private String responseCode;

    @ApiModelProperty(value = "响应message",example = "操作成功")
    private String responseMsg;

	@ApiModelProperty(value = "响应接口名",example = "XX接口",hidden = true)
	private String functionName;

	@ApiModelProperty(value = "响应接口码值",example = "INTERFACECODE",hidden = true)
	private String functionCode;

	public ResponseObj() {
    }

    public ResponseObj(String code,String msg,Object data,String functionName,String functionCode) {
        this.responseCode = code;
        this.responseMsg = msg;
        this.responseData = data;
        this.functionName = functionName;
        this.functionCode = functionCode;
    }

	public ResponseObj(String code,String msg,String functionName,String functionCode) {
		this.responseCode = code;
		this.responseMsg = msg;
		this.responseData = "";
		this.functionName = functionName;
		this.functionCode = functionCode;
	}

    public static ResponseObj SUCCESS(Object data,String functionName,String functionCode) {
        return new ResponseObj(Constant.SYS_CONSTANT_0,"操作成功",data,functionName,functionCode);
    }

	public static ResponseObj SUCCESS(String functionName,String functionCode) {
		return new ResponseObj(Constant.SYS_CONSTANT_0,"操作成功",functionName,functionCode);
	}
	
	public static ResponseObj SUCCESS(String msg,Object data,String functionName,String functionCode) {
		return new ResponseObj(Constant.SYS_CONSTANT_0,msg,data,functionName,functionCode);
	}
	
	public Object getResponseData() {
		return responseData;
	}

	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}
}
