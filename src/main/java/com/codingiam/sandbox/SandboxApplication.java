package com.codingiam.sandbox;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class SandboxApplication {
	
	@RequestMapping("/")
    String home() {
        return "Hello World!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);
	}
}
