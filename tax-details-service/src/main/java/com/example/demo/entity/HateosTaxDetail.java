package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.representer.Representer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
@Entity
@Table(name="syntaxdetails")
public class HateosTaxDetail extends RepresentationModel<HateosTaxDetail>{
	
		@Id
		String panNumber;
		String entityType;
		String entityName;
		String itCircle;
		
	

}
