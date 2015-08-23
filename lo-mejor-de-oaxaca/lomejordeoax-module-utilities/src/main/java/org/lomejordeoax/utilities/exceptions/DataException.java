package org.lomejordeoax.utilities.exceptions;

public class DataException extends Exception {

	private static final long serialVersionUID = -7216595539630888315L;

	public DataException(String message){
		super(message);
	}
	public DataException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
