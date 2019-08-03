package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.search.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	SearchService searchService;
	
	@GetMapping("/search/{numberToBeSearched}")
	public boolean isNumberPresent(@PathVariable int numberToBeSearched) {
		return searchService.search(numberToBeSearched);
		
	}

}
