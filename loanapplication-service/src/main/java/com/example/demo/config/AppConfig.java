package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.TaxDetails;

@Configuration
public class AppConfig {

	
	@Bean
	public TaxDetails vishal() {
		
		return new TaxDetails("aax294xp", "salaried", "Vishal", "Pune-II");
	}
}
