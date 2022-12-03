package com.voter.exceptionProject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {
	@ExceptionHandler(AgeNotValid.class)
	public ResponseEntity<String> handler(AgeNotValid ag){
		return new ResponseEntity<String>(ag.getMsg(),ag.getCode());
	}

}
