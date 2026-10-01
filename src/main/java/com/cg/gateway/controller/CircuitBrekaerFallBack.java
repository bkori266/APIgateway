package com.cg.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBrekaerFallBack {

	
	@GetMapping("/bankFallback")
	public ResponseEntity<String> fallback() {
		return new ResponseEntity<>("Bank service is unavailable",HttpStatus.OK);
	}
}