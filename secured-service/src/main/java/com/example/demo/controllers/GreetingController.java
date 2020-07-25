package com.example.demo.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	
	@GetMapping(path = "/greet")
	@Secured("ROLE_ADMIN")
	public String morning() {
		
		return "Good Morning";
	}
	
	
	@GetMapping(path = "/wish")
	public String wishing() {
		
		return "Happy Birthday";
	}
	
}
