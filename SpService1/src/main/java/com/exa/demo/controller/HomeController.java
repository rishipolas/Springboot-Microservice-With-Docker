package com.exa.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@RequestMapping(value = "/test")
	public String m1() {
		return "Hello Microservice 1";
	}
	
	
	
	
}
