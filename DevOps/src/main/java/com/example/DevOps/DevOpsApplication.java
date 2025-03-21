package com.example.DevOps;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "hello";
	}
}
