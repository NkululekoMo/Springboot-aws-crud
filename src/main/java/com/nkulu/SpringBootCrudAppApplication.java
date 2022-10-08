package com.nkulu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCrudAppApplication {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to AWS First Deployment...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudAppApplication.class, args);
		//System.out.println("Connected to Server.");
	}

}
