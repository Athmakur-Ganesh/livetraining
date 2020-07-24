package com.example.demo.ifaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "CUSTOMER-IMAGE-SERVICE")
public interface CustomerImageClient {

	@RequestMapping(method = RequestMethod.GET,path = "/api/v1/images/{id}")
	public String getImageById(@PathVariable("id") int id);
}
