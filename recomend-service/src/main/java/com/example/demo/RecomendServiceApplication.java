package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Recommendation;
import com.example.demo.repo.RecomendRepository;

@SpringBootApplication
public class RecomendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecomendServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			private RecomendRepository repo;
			
			@Override
			public void run(String... args) throws Exception {

				repo.save(new Recommendation(101,"PERLOAN","Kotak"));
				repo.save(new Recommendation(102,"PERLOAN","City Bank"));
				repo.save(new Recommendation(103,"HOULOAN","Lic HFL"));
				repo.save(new Recommendation(101,"HOULOAN","SBI HFL"));
				
			}
		};
	}
}
