package com.devdojo.microsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan ("com.devdojo.core.database.entity")
@EnableJpaRepositories("com.devdojo.core.database.repository")
public class MicrosserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosserviceApplication.class, args);
	}

}
