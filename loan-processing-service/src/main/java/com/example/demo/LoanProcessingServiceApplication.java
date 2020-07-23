package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableDiscoveryClient
public class LoanProcessingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanProcessingServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate template() {
		
		return new RestTemplate();
	}
	
//	@Bean
//	public CorsFilter corsfilter() {
//		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	    final CorsConfiguration config = new CorsConfiguration();
//	    config.setAllowCredentials(true);
//	    config.setAllowedOrigins(Collections.singletonList("*"));
//	    config.setAllowedHeaders(Collections.singletonList("*"));
//	    config.setAllowedMethods(Arrays.stream(HttpMethod.values())
//	    		 .map(HttpMethod::name).collect(Collectors.toList()));
//	    source.registerCorsConfiguration("/**", config);
//	    return new CorsFilter(source);
//	}
}
