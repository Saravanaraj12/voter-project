package com.voter.exceptionProject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {
	@ExceptionHandler(AgeNotValid.class)
	public ResponseEntity<Object> handler(AgeNotValid ag){
		return new ResponseEntity<object>(ag.getMsg(),ag.getCode());
	}

}
