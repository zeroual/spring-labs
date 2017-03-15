package com.polytech;

import com.polytech.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ApplicationConfig.class)
public class ApplicationStarter {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "DEV");
		SpringApplication.run(ApplicationStarter.class, args);
	}
}
