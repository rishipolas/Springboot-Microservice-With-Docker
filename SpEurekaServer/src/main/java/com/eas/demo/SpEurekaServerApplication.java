package com.eas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpEurekaServerApplication.class, args);
	}

}
