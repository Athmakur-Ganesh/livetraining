package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Recommendation;
import com.example.demo.services.RecomendService;

import lombok.Setter;

@RestController
@CrossOrigin(origins = "*")
@Setter
public class RecomendController {

	
	@Autowired
	private RecomendService service;
	
	
	@GetMapping(path = "/api/v1/suggestions/{product}")
	public List<Recommendation> findByProduct(@PathVariable ("product") String product){
		
	
		return this.service.findByProduct(product);
	}
	
	@GetMapping(path = "/api/v1/suggestions/byid/{id}")
	public Recommendation findById(@PathVariable ("id") int id){
		
	
		return this.service.findById(id);
	}
	
	@GetMapping(path = "/api/v1/suggestions/example")
	public List<Recommendation> findByExample(){
		
		Recommendation entity =new Recommendation();
		
		entity.setProductName("PERLOAN");
		
		return this.service.find(entity);
	}
}
