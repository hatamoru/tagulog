package com.example.tagulog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class TagulogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagulogApplication.class, args);
	}

}
