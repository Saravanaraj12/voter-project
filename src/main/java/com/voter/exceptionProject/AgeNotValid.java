package com.voter.exceptionProject;

import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
public class AgeNotValid extends RuntimeException{
	private String msg;
	private HttpStatus code;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HttpStatus getCode() {
		return code;
	}
	public void setCode(HttpStatus code) {
		this.code = code;
	}
	public AgeNotValid(String msg, HttpStatus badRequest) {
		super();
		this.msg = msg;
		this.code = badRequest;
	}

}
