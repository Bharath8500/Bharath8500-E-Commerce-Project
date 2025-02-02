package com.example.demo;

import com.example.demo.model.Inventory;
import com.example.demo.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository repository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("Iphone-13");
			inventory.setQuantity(1000);
			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("Iphone-14");
			inventory1.setQuantity(1000);
			repository.save(inventory);
			repository.save(inventory1);
		};
	}
}
