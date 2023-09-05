package com.oti.exceptions;

public class PolicyIdNotFoundException extends RuntimeException{
	public PolicyIdNotFoundException() {
		super();
	}
	public PolicyIdNotFoundException(String msg) {
		super(msg);
	}

}
