package com.capgemini.bookapp.exceptions;

public class BookNameCannotBeNull extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNameCannotBeNull(String message) {
		super(message);
	}
}
