package com.searchApp.springBootPostExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.searchApp.springBootPostExample.entity.SearchSet;
import com.searchApp.springBootPostExample.search.SearchService;

@RestController
public class SearchController {

	@Autowired
	SearchService searchService;

	@GetMapping("/search/{numberToBeSearched}")
	public boolean isNumberPresent(@PathVariable int numberToBeSearched) {
		return searchService.search(numberToBeSearched);

	}

	@PostMapping("/search")
	public String addSearchSet(@RequestBody SearchSet newSearchSet) {

		String responseText = "Successfully Added";

		System.out.println(newSearchSet);
		
		SearchSet createSearchSet=searchService.saveSearchSet(newSearchSet);

		
		System.out.println("created search set :"+createSearchSet);
		return responseText;

	}

}
