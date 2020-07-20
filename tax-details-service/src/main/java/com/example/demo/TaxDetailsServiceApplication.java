package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.TaxDetail;
import com.example.demo.repos.TaxDetailsRepository;

@SpringBootApplication
public class TaxDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxDetailsServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
		
			@Autowired
			TaxDetailsRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new TaxDetail("aa11", "employed", "vignesh", "chennai-1"));
			}
		};
	}
}
