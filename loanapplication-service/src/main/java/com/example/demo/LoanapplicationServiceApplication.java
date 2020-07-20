package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.demo.entity.CibilScore;
import com.example.demo.entity.Customer;
import com.example.demo.entity.LoanApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class LoanapplicationServiceApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext ctx = SpringApplication.run(LoanapplicationServiceApplication.class, args);
	
		
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(LoanapplicationServiceApplication.class)
				          .bannerMode(Mode.OFF).run(args);
		
		
		  LoanApplication rameshLoan1= ctx.getBean(LoanApplication.class);
		  
		 LoanApplication rameshLoan2 = (LoanApplication)ctx.getBean("ramesh");
		 
		 log.info(" Loan 1 ===========> "+rameshLoan1.toString());
		 
		 log.info("Loan 2 ==========>"+ rameshLoan2.toString());
		 
		 boolean status =ctx.isSingleton("ramesh");
		 
		 
		 log.info("Is Ramesh Singleton ==>"+status);
		
		 
      boolean chkstatus =ctx.isPrototype("ramesh");
		 
		 
		 log.info("Is Ramesh Prototype ==>"+chkstatus);

		 
//		//CibilScore sureshScore = ctx.getBean(CibilScore.class,"score");
//		 
//	
//		 CibilScore sureshScore = ctx.getBean(CibilScore.class);
//			
//		 log.info("Cibil Score 1  ================>"+sureshScore);
	
	}

	// This is a Factory Method to be used by the IoC container
	@Bean
	//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Lazy
	public LoanApplication ramesh() {
		
		// Constructor DI Used
		return new LoanApplication(101, ram(), 50000);
	}
	
	@Bean
	@Primary
	public CibilScore score() {
		
		// Setter DI Used
		CibilScore score = new CibilScore();
		
		score.setFirstName("Suresh");
		score.setId(102);
		
		return score;
	}
	
	@Bean
	public CibilScore score2() {
		
		CibilScore score = new CibilScore();
		
		score.setFirstName("Sushil");
		score.setId(103);
		
		return score;
	}
	
	@Bean
	public Customer ram() {
		
		return new Customer(9484848,"Ramesh","Gupta","ram@abc.com");
	}
}
