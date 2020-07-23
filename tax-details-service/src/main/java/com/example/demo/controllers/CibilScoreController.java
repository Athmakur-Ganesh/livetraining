package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CibilScore;
import com.example.demo.repos.CibilScoreRepository;

@RestController
public class CibilScoreController {

	private CibilScoreRepository repo;
	
	@Value("${server.port}")
	private String port;
	@GetMapping(path = "/api/v1/cibilscores/{panNumber}")
	public CibilScore findByPanNumber(@PathVariable("panNumber") String panNumber) {
		
		 //CibilScore score = repo.findByPanNumber(panNumber);
		 
		 CibilScore score = new CibilScore(2020, "aa", "Ramesh", 4848);
		 score.setScore(Integer.parseInt(port));
		
		 return score;
	}
}
