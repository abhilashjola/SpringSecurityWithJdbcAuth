package com.dakr.Controller;

import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@PostMapping("/admin")
	public String admin() {
		return "welcome to ADMIN";
	}
	
	@PostMapping("/user")
	public String user() {
		return "welcome to user";
	}
	
	@PostMapping("/")
	public String welcome() {
		return "wElComE To OUr PAgE";
	}
}
