package com.example.java_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAppApplication {

	@GetMapping("/")
	public String hello()
	{
		return "Hello from Maven";
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaAppApplication.class, args);
	}

}
