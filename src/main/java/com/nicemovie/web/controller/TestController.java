package com.nicemovie.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {
	
	@GetMapping("/hello")
	public ResponseEntity<?> hello() {
		return ResponseEntity.ok("hello");		
	}
}
