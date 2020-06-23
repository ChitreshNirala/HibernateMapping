package com.telusko.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {

	@RequestMapping("/")
	public String home() {
		return "Home.jpa";
		
	}
}
