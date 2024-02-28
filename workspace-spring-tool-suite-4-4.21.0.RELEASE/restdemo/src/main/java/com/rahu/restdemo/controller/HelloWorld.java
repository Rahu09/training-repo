package com.rahu.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "hello";
	}
}