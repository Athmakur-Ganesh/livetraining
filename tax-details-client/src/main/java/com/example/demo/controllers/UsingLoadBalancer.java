package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UsingLoadBalancer {

	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/client/{panNumber}")
	public String getScores(@PathVariable("panNumber") String panNumber) {
	
		String resp =
				this.template.getForObject("http://cibil-service/api/v1/cibilscores/"+panNumber
						, String.class);
		
		return resp;
	}
}