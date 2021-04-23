package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class JenkinsController {

	@GetMapping("/")
	public String getHomePage() {
		return "<h1>Welcome to home page</h1>";
	}
	
	@GetMapping("/admin")
	public String getAdminPage() {
		return "<h1>Welcome to admin page</h1>";
	}
	@GetMapping("/user")
	public String getUserPage() {
		return "<h1>Welcome to user page</h1>";
	}
}


