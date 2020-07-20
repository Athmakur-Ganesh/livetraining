package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class LoanApplication {

	private int applicationNumber;
	private Customer customerName;
	private double loanAmount;
	
	@Autowired
	@Qualifier("vishal")
	private TaxDetails taxDetails;
	
	public LoanApplication(int applicationNumber, Customer customerName, double loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		log.info("*** Loan Application Initlaized ****");

	}
	
		
	
}
