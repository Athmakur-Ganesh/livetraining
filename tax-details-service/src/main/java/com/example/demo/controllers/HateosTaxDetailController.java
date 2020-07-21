package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.HateosTaxDetail;
import com.example.demo.entity.TaxDetail;
import com.example.demo.repos.HateosTaxDetailRepository;
import com.example.demo.services.TaxDetailsService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = "*")
@Setter
@Slf4j
public class HateosTaxDetailController {

	@Autowired
	private HateosTaxDetailRepository service;
	
	@GetMapping(path = "/api/v2/taxdetails",produces = "application/hal+json")
	public List<HateosTaxDetail> findAll(){
		
		log.info("find All Method Invoked");
		return this.service.findAll();
	}
}


	
	