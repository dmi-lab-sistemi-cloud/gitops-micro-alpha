package com.example.microalpha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroAlphaController 
	@GetMapping("/")
	public String hello() {
		return "<h1>UPDATED Hello from MicroApha!</h1>\n";
	}
}
