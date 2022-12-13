package com.employee.Exceptions;

public class MobileNumberAlreadyExist extends RuntimeException{

	public MobileNumberAlreadyExist() {};
	
	public MobileNumberAlreadyExist(String msg) {
		super(msg);
	}
}
