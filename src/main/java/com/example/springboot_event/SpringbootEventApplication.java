package com.example.springboot_event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEventApplication.class, args);
	}

}
