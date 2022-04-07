package com.training;

public class InvaildEmailException extends Exception {
	private String message;

	public InvaildEmailException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	
	
	

}
