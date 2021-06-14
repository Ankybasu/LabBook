package com.capgemini.contactmanagerapp.exceptions;

public class LastNameBlankException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LastNameBlankException(String message) {
		super(message);
	}
}
