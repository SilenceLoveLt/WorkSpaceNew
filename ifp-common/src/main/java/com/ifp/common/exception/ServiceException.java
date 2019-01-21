package com.ifp.common.exception;

/**
 * 服务异常；
 * 业务异常的具体化。
 * @author xman
 *
 */
public class ServiceException extends BusinessException {

	private static final long serialVersionUID = 1L;
	
	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ServiceException(String message, int code) {
		super(message, code);
	}

	public ServiceException(int code, Throwable cause) {
		super(code, cause);
	}
	
	public ServiceException(String message, int code, Throwable cause) {
		super(message, code, cause);
	}

}
