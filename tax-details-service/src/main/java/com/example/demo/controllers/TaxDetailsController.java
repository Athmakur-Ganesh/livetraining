package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TaxDetail;
import com.example.demo.services.TaxDetailsService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = "*")
@Setter
@Slf4j
public class TaxDetailsController {

	
	@Autowired
	private TaxDetailsService service;
	
	@GetMapping(path = "/api/v1/taxdetails")
	public List<TaxDetail> findAll(){
		
		return this.service.findAll();
	}
}
