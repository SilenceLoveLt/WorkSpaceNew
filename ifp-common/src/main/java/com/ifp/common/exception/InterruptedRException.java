package com.ifp.common.exception;

/**
 * 
 * @see java.lang.InterruptedException
 * @author xman
 *
 */
public class InterruptedRException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InterruptedRException(String message) {
		super(message);
	}

	public InterruptedRException(Throwable cause) {
		super(cause);
	}

	public InterruptedRException(String message, Throwable cause) {
		super(message, cause);
	}

}
