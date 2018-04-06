package com.example.rest.webservices.demorestfulwebservice.constroller;

public class HelloWorldBean {

	private String message;
	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HelloWorldBean(String string) {
		this.message = string;
	}

}
