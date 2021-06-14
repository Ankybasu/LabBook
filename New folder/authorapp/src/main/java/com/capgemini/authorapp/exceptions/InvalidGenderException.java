package com.capgemini.authorapp.exceptions;

public class InvalidGenderException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidGenderException(String message) {
		super(message);
	}
}
