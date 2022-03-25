package com.sofka.generator.password;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class PasswordApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordApplication.class, args);
	}

}
