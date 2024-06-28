package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductService1Application {

	public static void main(String[] args) {

		SpringApplication.run(ProductService1Application.class, args);
		System.out.println("Added sysout line from productservice main method");

	}

}
