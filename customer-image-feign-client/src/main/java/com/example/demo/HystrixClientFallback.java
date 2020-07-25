package com.example.demo;

import com.example.demo.ifaces.CustomerImageClient;
import org.springframework.stereotype.*;
@Component
public class HystrixClientFallback implements CustomerImageClient {

	@Override
	public String getImageById(int id) {
		return new String("{0, guest, /images/custmer.jpg, Default  Image}");
	}

}
