package com.codehunter.ssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.codehunter.ssl")
public class SslApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslApplication.class, args);
	}

}
