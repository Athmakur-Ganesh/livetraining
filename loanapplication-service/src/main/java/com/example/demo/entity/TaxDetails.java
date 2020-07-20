package com.example.demo.entity;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;



@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class TaxDetails {

	String panNumber;
	String entityType;
	String entityName;
	String itCircle;
	
	@Autowired
	Environment env;
	
	public TaxDetails() {
		super();
	
//		String[] active =env.getActiveProfiles();
//		
//		Arrays.asList(active).forEach(System.out::println);
	}

	public TaxDetails(String panNumber, String entityType, String entityName, String itCircle) {
		super();
		this.panNumber = panNumber;
		this.entityType = entityType;
		this.entityName = entityName;
		this.itCircle = itCircle;
	}

	
	@PostConstruct
	public void init() {
		

		String[] active =env.getActiveProfiles();
		
		Arrays.asList(active).forEach(System.out::println);
		
	}
	
	
}
