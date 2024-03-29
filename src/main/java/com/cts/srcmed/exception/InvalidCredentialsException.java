package com.cts.srcmed.exception;

import org.aspectj.lang.annotation.SuppressAjWarnings;

@SuppressAjWarnings("serial")
public class InvalidCredentialsException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public InvalidCredentialsException(String message) {
		super(message);
	}
}
