package com.ifp.common.utils;

public class HttpConnectionException extends RuntimeException {

	private static final long serialVersionUID = 5640008836191095956L;

	public HttpConnectionException(String msg){
		super(msg);
	}

    public HttpConnectionException(String msg, Throwable cause) {
        super(msg, cause);
    }	
	
}
