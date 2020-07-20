package com.example.demo.entity;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.persistence.*;

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
@Entity
@Table(name="syntaxdetails")
public class TaxDetail {

	@Id
	String panNumber;
	String entityType;
	String entityName;
	String itCircle;
	
	
	
	public TaxDetail() {
		super();
	
//		String[] active =env.getActiveProfiles();
//		
//		Arrays.asList(active).forEach(System.out::println);
	}

	public TaxDetail(String panNumber, String entityType, String entityName, String itCircle) {
		super();
		this.panNumber = panNumber;
		this.entityType = entityType;
		this.entityName = entityName;
		this.itCircle = itCircle;
	}

	
	
	
	
}
