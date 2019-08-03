package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.search.SearchService;

@SpringBootApplication
public class DemoSpringWebApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoSpringWebApplication.class);
	public static void main(String[] args) {
		
		LOGGER.debug("before calling fn");
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringWebApplication.class, args);
		SearchService searchService = applicationContext.getBean(SearchService.class);
		searchService.search();
		LOGGER.debug("after calling fn");
	}

}
