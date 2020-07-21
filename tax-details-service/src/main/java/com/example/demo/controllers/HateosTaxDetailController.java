package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CibilScore;
import com.example.demo.entity.HateosTaxDetail;
import com.example.demo.repos.HateosTaxDetailRepository;

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
	public CollectionModel<HateosTaxDetail> findAll(){
		
		log.info("find All Method Invoked");
		List<HateosTaxDetail> details= this.service.findAll();
		
		for(HateosTaxDetail eachItem: details) {
			
			Link link = WebMvcLinkBuilder.linkTo(HateosTaxDetailController.class)
					        .slash("/api/v1/cibilscore/"+eachItem.getPanNumber()).withRel("cibilscore");
		
			eachItem.add(link);
		}
		
		  Link selfLink = WebMvcLinkBuilder.linkTo(TaxDetailsController.class).slash("/api/v1/taxdetails/").withRel("version1");
		  
			CollectionModel<HateosTaxDetail> response = 
				 CollectionModel.of(details,selfLink);
		 
		 
		return response;
	}
	
	
	@GetMapping(path = "/api/v2/taxdetails/{panNumber}",produces = "application/hal+json")
	public CibilScore findByPan(){
		
		
		return new CibilScore(24,"aa","ramesh",450);
		
	}
}


	
	