package com.example.microservices.inventory;

import org.springframework.boot.SpringApplication;

import com.example.microservices.InventoryApplication;

public class TestInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.from(InventoryApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
