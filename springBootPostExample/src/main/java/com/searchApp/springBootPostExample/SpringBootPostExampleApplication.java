package com.searchApp.springBootPostExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.searchApp")
@EntityScan("com.searchApp.springBootPostExample")
public class SpringBootPostExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostExampleApplication.class, args);
	}

}
