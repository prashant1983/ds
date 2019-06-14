package com.mycompany.core.exceptionhandling;

public class ProductException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ProductException(String message, Throwable throwable) {

		super(message, throwable);
	}

	ProductException(String message) {

		super(message);
	}

}
