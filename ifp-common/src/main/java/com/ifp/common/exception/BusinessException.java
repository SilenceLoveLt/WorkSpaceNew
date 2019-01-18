package com.ifp.common.exception;

/**
 * 业务异常，此异常或者继承类的提示语需要提示给前端用户。
 * 
 * @author xman
 *
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private int code;
	
	public BusinessException() {
		
	}
	
	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public BusinessException(String message, int code) {
		super(message);
		this.code = code;
	}

	public BusinessException(int code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	public BusinessException(String message, int code, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
