package com.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//simple spring security by just adding dependency "spring-boot-starter-security"
//default authentication
//form based authentication

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}

}
