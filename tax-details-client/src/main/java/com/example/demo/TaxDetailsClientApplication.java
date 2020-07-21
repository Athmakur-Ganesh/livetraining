package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TaxDetailsClientApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(TaxDetailsClientApplication.class, args);
		
		RestTemplate template = 
				ctx.getBean(RestTemplate.class);
		
	String resp =	 template.getForObject("http://localhost:2020/api/v1/taxdetails", String.class);
	
	System.out.println(resp);
	
	}

	
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}
}
