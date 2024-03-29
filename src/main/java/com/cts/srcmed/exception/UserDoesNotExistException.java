package com.cts.srcmed.exception;

import org.aspectj.lang.annotation.SuppressAjWarnings;

@SuppressAjWarnings("serial")
public class UserDoesNotExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserDoesNotExistException(String message) {
		super(message);
	}
}
