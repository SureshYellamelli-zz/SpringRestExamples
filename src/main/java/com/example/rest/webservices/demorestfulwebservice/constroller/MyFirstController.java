package com.example.rest.webservices.demorestfulwebservice.constroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
	
	@GetMapping(path = "/sayHello")
	public String sayHello() {
		return "Hello There Suresh";
	}

	@GetMapping(path = "/helloworldbean")
	public HelloWorldBean sayhi() {
		return new HelloWorldBean("Hello World!!");
	}
}
