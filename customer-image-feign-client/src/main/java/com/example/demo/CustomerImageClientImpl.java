package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ifaces.CustomerImageClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CustomerImageClientImpl implements CustomerImageClient {

	@Autowired
	private CustomerImageClient client;
	
	@GetMapping(path = "/feignClient/{id}")
	@Override
	public String getImageById(@PathVariable("id") int id) {
		
		log.info("get Image by Called ");
		return this.client.getImageById(id);
	}

}
