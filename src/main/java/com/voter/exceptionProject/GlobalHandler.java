package com.voter.exceptionProject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {
	@ExceptionHandler(AgeNotValid.class)
	public ResponseEntity<Object> handler(AgeNotValid ag){
		return new ResponseEntity<Object>(ag.getMsg(),ag.getCode());
	}

}
