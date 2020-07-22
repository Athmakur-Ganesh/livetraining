package com.example.demo;

import java.util.List;

import org.example.demo.aop.CommonPointCuts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;

import com.example.demo.entity.Address;
import com.example.demo.entity.Recommendation;
import com.example.demo.entity.User;
import com.example.demo.repo.RecomendRepository;
import com.example.demo.repo.UserRepository;
import javax.persistence.criteria.*;

@SpringBootApplication
public class RecomendServiceApplication {

	 
	public static void main(String[] args) {
		SpringApplication.run(RecomendServiceApplication.class, args);
	}

	@Bean
	public CommonPointCuts points() {
		
		return new CommonPointCuts();
	}
	
	@Bean
	public CommandLineRunner runner() {
		
		
		
		return new CommandLineRunner() {
			
			@Autowired
			private UserRepository userRepository;
			
			@Autowired
			private RecomendRepository repo;
			
			@Override
			public void run(String... args) throws Exception {

				repo.save(new Recommendation(101,"PERLOAN","Kotak"));
				repo.save(new Recommendation(102,"PERLOAN","City Bank"));
				repo.save(new Recommendation(103,"HOULOAN","Lic HFL"));
				repo.save(new Recommendation(104,"HOULOAN","SBI HFL"));
				
				
		
				
				  User user = new User();
				  //user.setEmail("ram@abc.com");

				  Address address = new Address();
				       address.setCity("chennai");				  
				  
				  user.setAddress(address);
				  
		            Example<User> example = Example.of(user);

		            List<User> list = userRepository.findAll(example);
		            
		            for(User eachUser:list) {
		            	System.out.println(eachUser.getName());
		            	System.out.println(eachUser.getEmail());
		            	System.out.println(eachUser.getAddress().getCity());
		            }
		            
			}
		};
	}
}
