package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GreetingController {

	@GetMapping(path = "/api/v1/message/{name}")
	public String showMessage(@PathVariable("name") String name) {
		
		return "Welcome "+name;
	}
}
