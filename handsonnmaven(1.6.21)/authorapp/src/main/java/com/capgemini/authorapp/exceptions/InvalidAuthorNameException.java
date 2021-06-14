
package com.capgemini.authorapp.exceptions;

public class InvalidAuthorNameException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAuthorNameException(String message) {
		super(message);
	}
}
