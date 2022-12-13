package com.employee.Exceptions;

public class AddressNotFound extends RuntimeException{

	public AddressNotFound() {};
	
	public AddressNotFound(String msg) {
		super(msg);
	}
}
