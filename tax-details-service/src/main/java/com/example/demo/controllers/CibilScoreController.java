package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CibilScore;
import com.example.demo.repos.CibilScoreRepository;

@RestController
public class CibilScoreController {

	private CibilScoreRepository repo;
	
	@GetMapping(path = "/api/v1/cibilscore/{panNumber}")
	public CibilScore findByPanNumber(@PathVariable("panNumber") String panNumber) {
		
		 return repo.findByPanNumber(panNumber);
	}
}
