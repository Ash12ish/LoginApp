package com.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JwtAuthenticationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationServerApplication.class, args);
	}

}
