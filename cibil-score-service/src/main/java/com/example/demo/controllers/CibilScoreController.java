package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CibilScore;
import com.example.demo.repos.CibilScoreRepository;

import lombok.Setter;

@RestController
@CrossOrigin(origins = "*")
@Setter
public class CibilScoreController {

	@Autowired
	private CibilScoreRepository service;
	
	
	@GetMapping(path = "/api/v1/scores",produces = "application/json")
	public List<CibilScore> getAll(){
		
		return this.service.findAll();
	}
	

}
