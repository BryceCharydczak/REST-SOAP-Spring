package com.revature.exception;

public class SoapShopFullException extends Exception {

	private String message = "Too much soap! :O";
	
	public SoapShopFullException() {
		super();
	}
	
	public SoapShopFullException(String message) {
		super(message);
}
}
