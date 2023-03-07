package com.yesdosoft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello first spring boot application");
		
	}

}
