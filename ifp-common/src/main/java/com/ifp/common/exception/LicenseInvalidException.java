package com.ifp.common.exception;

public class LicenseInvalidException extends Exception {

	private static final long serialVersionUID = 4061825995231824490L;

    public LicenseInvalidException(){
		super();
	}
	public LicenseInvalidException(String msg){
		super(msg);
	}
	
}
