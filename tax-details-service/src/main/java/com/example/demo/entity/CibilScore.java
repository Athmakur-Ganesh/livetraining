package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;


@AllArgsConstructor
@Data
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CibilScore {

	 int  id;
	 String panNumber;
	 String firstName;
	 double score;
	public CibilScore() {
		super();
		
		log.info("*** Cibil Score Initlaized ****");
	}
	 
	 
}
