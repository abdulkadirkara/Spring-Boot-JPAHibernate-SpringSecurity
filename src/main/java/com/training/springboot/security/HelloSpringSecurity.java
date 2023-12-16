package com.training.springboot.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringSecurity {

	@GetMapping("/helloSecurity")
	public String helloSecurity(){
		
		return "hellospringsecurity";
		
	}
}
