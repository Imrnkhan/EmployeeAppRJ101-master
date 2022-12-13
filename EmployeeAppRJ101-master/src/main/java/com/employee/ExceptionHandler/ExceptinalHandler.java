package com.employee.ExceptionHandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.employee.Exceptions.AddressNotFound;
import com.employee.Exceptions.EmployeeNotFound;
import com.employee.Exceptions.ErrorDetails;

@ControllerAdvice
public class ExceptinalHandler {
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<ErrorDetails> EmployeeNotFoundException(EmployeeNotFound error,WebRequest webRequest){
		
		ErrorDetails errorDetails=new ErrorDetails(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), "BAD REQUEST", error.getMessage());
		
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AddressNotFound.class)
	public ResponseEntity<ErrorDetails> tutorialNotFoundException(AddressNotFound error,WebRequest webRequest){
		
		ErrorDetails errorDetails=new ErrorDetails(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), "BAD REQUEST", error.getMessage());
		
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> noHandler(NoHandlerFoundException noHandler) {
		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), "NOT FOUND", "Not a Valid URL");
		
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<ErrorDetails> httpRequestMethodException(HttpRequestMethodNotSupportedException exception){
		
		ErrorDetails errorDetail = new ErrorDetails(LocalDateTime.now(), HttpStatus.METHOD_NOT_ALLOWED.value(), "Check the http method", exception.getMessage());
		
		return new ResponseEntity<ErrorDetails>(errorDetail, HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ResponseEntity<ErrorDetails> missingServletRequestParameterException(MissingServletRequestParameterException exception){
		
		ErrorDetails errorDetail = new ErrorDetails(LocalDateTime.now(), HttpStatus.METHOD_NOT_ALLOWED.value(), "comes from MissingServletRequestParameterException", exception.getMessage());
		
		return new ResponseEntity<ErrorDetails>(errorDetail, HttpStatus.METHOD_NOT_ALLOWED);
	}
}
