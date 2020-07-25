package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@CrossOrigin(origins = "*")
public class ImageClientController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/api/v1/images/{id}")
	@HystrixCommand(fallbackMethod = "getImageFallBack",
	commandProperties = @HystrixProperty(
			     name = "execution.isolation.thread.timeoutInMilliseconds",
			      value = "2000"))
	public String getImage(@PathVariable("id") int id) {
		
		String url ="http://CUSTOMER-IMAGE-SERVICE/api/v1/images/"+id;
		return this.template.getForObject(url, String.class);
	}
	
	public String getImageFallBack(int id) {
		
		return new String("{0, gues, /images/custmer.jpg, Default  Image}");

	}
	
	
}
