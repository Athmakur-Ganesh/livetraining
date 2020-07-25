package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Recommendation;

@Repository
public interface RecomendRepository extends 
QueryByExampleExecutor<Recommendation>, JpaRepository<Recommendation, Integer> {

	public List<Recommendation> findByproductName(String product);
	
	
}
