package com.pratices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pratices.demo")
public class PraticesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraticesApplication.class, args);
	}

}
