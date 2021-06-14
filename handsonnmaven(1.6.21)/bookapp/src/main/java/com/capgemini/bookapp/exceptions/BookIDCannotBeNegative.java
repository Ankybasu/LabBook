package com.capgemini.bookapp.exceptions;

public class BookIDCannotBeNegative extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookIDCannotBeNegative(String message) {
		super(message);
	}
}
