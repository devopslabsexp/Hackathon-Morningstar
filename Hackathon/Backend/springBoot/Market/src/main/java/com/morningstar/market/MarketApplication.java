package com.morningstar.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.morningstar.market.service.MrfInDB;

@SpringBootApplication
public class MarketApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MarketApplication.class, args);
	}
	
}
