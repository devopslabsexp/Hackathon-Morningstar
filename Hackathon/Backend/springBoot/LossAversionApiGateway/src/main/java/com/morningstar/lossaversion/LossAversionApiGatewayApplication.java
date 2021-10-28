package com.morningstar.lossaversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LossAversionApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LossAversionApiGatewayApplication.class, args);
	}

}
