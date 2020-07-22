package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.Specification;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "synaddresses")

@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
	
	    @Id
	    private Long id;

	    private String street;
	    private String city;
	    private String state;
	    private String zipCode;
	    private String country;
	    
	    @JsonIgnore
	    @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "user_id", nullable = false)
	    
	    private User user;


		public Address(Long id, String street, String city, String state, String zipCode, String country) {
			super();
			this.id = id;
			this.street = street;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
			this.country = country;
		}
	    
	   
}
