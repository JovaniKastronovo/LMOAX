package com.lomejordeoax.ctrls.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Hubo un error inesperado :(, por favor comunicate con tu administrado.")
public class ErrorMessageRespException extends RuntimeException {

	private static final long serialVersionUID = -3099638331559842702L;

	public ErrorMessageRespException(String msg) {
		super(msg);
	}
	
	public ErrorMessageRespException(String msg, Throwable t) {
		super(msg, t);
	}
}
