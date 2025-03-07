package com.company.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
		String userName = System.getenv("USER_NAME");
		System.out.println("Hello, " + userName + "!");
	}

}
