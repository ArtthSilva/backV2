package com.ruhtra.alunoonlineapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AlunoonlineapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlunoonlineapiApplication.class, args);
	}

}
