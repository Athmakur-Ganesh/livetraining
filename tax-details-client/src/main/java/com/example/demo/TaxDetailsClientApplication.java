package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.configs.RibbonConfig;

@SpringBootApplication
@RibbonClient(name = "cibil-service",configuration = RibbonConfig.class)
public class TaxDetailsClientApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(TaxDetailsClientApplication.class, args);
		
	
	
	}

	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		
		return new RestTemplate();
	}
}
