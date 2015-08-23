package org.lomejordeoax.utilities.exceptions;

public class BusinessException extends Exception {

	private static final long serialVersionUID = -7032781770243008658L;
	
	public BusinessException(String message){
		super(message);
	}
	
	public BusinessException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
