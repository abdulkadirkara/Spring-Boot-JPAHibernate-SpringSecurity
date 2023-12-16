package com.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.training.springboot.security.utils")
public class SpringBootTraining {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTraining.class, args);
	}

}
