package com.ezss.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableDiscoveryClient
@EnableJpaRepositories
@SpringBootApplication
public class SpService2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(SpService2Application.class, args);
	}

}
