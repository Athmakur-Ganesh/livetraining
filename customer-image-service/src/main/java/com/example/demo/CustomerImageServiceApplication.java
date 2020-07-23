package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.CustomerImage;

@SpringBootApplication
public class CustomerImageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerImageServiceApplication.class, args);
	}

	@Bean
public  CustomerImage specific() {
	
		return new CustomerImage(101, "Ramesh", "/images/ramesh.jpg", "customer avatar");
}
	
	@Bean
	private  CustomerImage standBy() {
		
		return new CustomerImage(0, "gues", "/images/custmer.jpg", "Default  Image");
	}
}
