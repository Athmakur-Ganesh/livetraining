package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.TaxDetail;
import com.example.demo.repos.TaxDetailsRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info =@Info(title = "Loan Processing Service"))
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
				
				repo.save(new TaxDetail("aa", "employed", "vignesh", "chennai-1"));
			}
		};
	}
}
