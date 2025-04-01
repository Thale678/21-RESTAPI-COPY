package com.rest.api.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/test")
	public String hello() {

		return "Hello guys,Todays Date  is " + LocalDate.now().toString() + "\n Its my first jenkins pipeline";

	}

}
