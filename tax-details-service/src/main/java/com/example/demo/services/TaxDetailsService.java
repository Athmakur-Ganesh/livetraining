package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaxDetail;
import com.example.demo.repos.TaxDetailsRepository;

import lombok.Setter;

@Service
@Setter
public class TaxDetailsService {

	@Autowired
	private TaxDetailsRepository repo;
	
	
	
	public List<TaxDetail> findAll(){
		
		return this.repo.findAll();
	}
	
	public TaxDetail add(TaxDetail entity) {
		
		return this.repo.save(entity);
	}
	
	
    public TaxDetail update(TaxDetail entity) {
		
		return this.repo.save(entity);
	}
    
   public void remove(TaxDetail entity) {
		
		this.repo.delete(entity);
	}
    
}
