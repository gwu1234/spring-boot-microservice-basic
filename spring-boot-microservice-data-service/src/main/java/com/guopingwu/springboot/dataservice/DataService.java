package com.guopingwu.springboot.dataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DataService {

	public static void main(String[] args) {
		SpringApplication.run(DataService.class, args);
	}
}
