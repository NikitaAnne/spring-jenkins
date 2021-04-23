package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class JenkinsController {

	@GetMapping("/")
	public String getHomePage() {
		return "Welcome to home page";
	}
	
	@GetMapping("/admin")
	public String getAdminPage() {
		return "Welcome to admin page";
	}
	@GetMapping("/user")
	public String getUserPage() {
		return "Welcome to user page";
	}
}


