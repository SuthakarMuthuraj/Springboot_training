package com.example.searchApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.services.SearchService;

@SpringBootApplication
public class SearchAppApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SearchAppApplication.class);

	public static void main(String[] args) {
		LOGGER.debug("spring boot app start before calling");
		ApplicationContext applicationContext = SpringApplication.run(SearchAppApplication.class, args);
		SearchService searchService = applicationContext.getBean(SearchService.class);
		LOGGER.debug("spring boot app after calling");
	}

}
