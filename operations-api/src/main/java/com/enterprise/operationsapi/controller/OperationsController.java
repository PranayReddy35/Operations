package com.enterprise.operationsapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {

@GetMapping(value="/")
	public String helloWorld() {
		return "Welcome to Operations Application.";	
	}
}
