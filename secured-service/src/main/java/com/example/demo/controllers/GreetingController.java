package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	
	@GetMapping(path = "/greet")
	public String morning() {
		
		return "Good Morning";
	}
	
	
	@GetMapping(path = "/wish")
	public String wishing() {
		
		return "Happy Birthday";
	}
	
}
