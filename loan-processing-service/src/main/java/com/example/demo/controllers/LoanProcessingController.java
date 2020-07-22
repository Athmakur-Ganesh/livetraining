package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*")
public class LoanProcessingController {

	
	@Autowired
	private RestTemplate template;
	
	private  String baseURL = "http://CIBIL-SCORE-SERVICE/api/v1/scores";
	
	@GetMapping(path = "/api/v1/cibilScores",produces = "application/json")
	public String findCibilScore() {
		
		return this.template.getForObject(baseURL, String.class);
	}
}
