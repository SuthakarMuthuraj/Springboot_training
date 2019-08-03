package com.example.searchApp_web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SearchAppWebApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SearchAppWebApplication.class);

	public static void main(String[] args) {

		LOGGER.debug("before calling fn");
		SpringApplication.run(SearchAppWebApplication.class, args);
		/*
		 * ApplicationContext applicationContext =
		 * SpringApplication.run(SearchAppWebApplication.class, args); SearchService
		 * searchService = applicationContext.getBean(SearchService.class);
		 * searchService.search();
		 */ LOGGER.debug("after calling fn");
	}
	
	
	
}
