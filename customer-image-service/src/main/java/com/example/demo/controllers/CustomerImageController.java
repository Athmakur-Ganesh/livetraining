package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerImage;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class CustomerImageController {

	
	@Autowired
	@Qualifier("specific")
	private  CustomerImage specific;
	
	
	
	@GetMapping(path = "/api/v1/images/{id}")
	public CustomerImage fetchImage(@PathVariable("id") int id) 
			 throws InterruptedException {
		
		log.info("Fetch Image in Service called");
		     CustomerImage image = null;
		     
		     if(id<10) {
		    	
		    	 image = specific;
		     } else {
		    	 
		    	 Thread.sleep(6000);
		     }
		     
		     return image;
	}
}
