package com.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {

	@GetMapping("/")
	public String home() {
		return"Welcome to home page";
	}
	
	@GetMapping("/name/{pname}")
	public String getname(@PathVariable ("pname") String pname) {
		return"Welcome "+ pname;
	}
}
