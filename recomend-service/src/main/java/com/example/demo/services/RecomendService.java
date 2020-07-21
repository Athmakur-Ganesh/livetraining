package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Recommendation;
import com.example.demo.repo.RecomendRepository;

import lombok.Setter;

@Service
@Setter
public class RecomendService {

	@Autowired
	private RecomendRepository repo;
	
	public List<Recommendation> findByProduct(String product){
		
	
		return this.repo.findByproductName(product);
	}
}
