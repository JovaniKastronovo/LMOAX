package com.lomejordeoax.ctrls.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No hay respuesta del servicio")
public class EmptyReponseException extends RuntimeException {
	
	private static final long serialVersionUID = 7434729858891448705L;

	public EmptyReponseException(String msg) {
		super(msg);
	}
	
	public EmptyReponseException(String msg, Throwable t) {
		super(msg, t);
	}
	
}
