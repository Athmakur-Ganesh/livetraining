package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*")
public class CibilScoreClient {

	
	@Autowired
	private LoadBalancerClient loadBalancer;


	@Autowired
	private RestTemplate template;
	
	
	@GetMapping(path = "/scores/{id}")
	public  String fetchScores(@PathVariable("id") int id) {
		
		ServiceInstance instance = loadBalancer.choose("LOAD-BALANCED-CIBIL");
		
		String baseURI = instance.getUri().toString();
		
		String requestURL = baseURI+"/api/v1/scores/"+id;
		
		return template.getForObject(requestURL, String.class);
	}
	
	
}
