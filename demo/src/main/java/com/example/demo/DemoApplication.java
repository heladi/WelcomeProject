package com.example.demo;

import org.springframework.boot.SpringApplication;//bootstrap your spring application,register all the beans and get the server up
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

