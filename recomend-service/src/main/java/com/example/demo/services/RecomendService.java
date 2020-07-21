package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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
	
	public Recommendation findById(int id){
		
		
		return this.repo.findById(id).get();
	}
	
	public List<Recommendation> find(Recommendation entity) {

        
//		ExampleMatcher matcher = ExampleMatcher.matching()     
//				  .withIgnorePaths("id");                         

        
		ExampleMatcher matcher = ExampleMatcher.matchingAny();                  

       Example<Recommendation> example = Example.of(entity,matcher);

         return repo.findAll(example);
	}
}


