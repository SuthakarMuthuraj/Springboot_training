package com.example.searchApp_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.search.BinarySearchImpl;
import com.example.demo.sort.ISort;

@Configuration
public class SearchImplFactory {
	
	@Autowired
	ISort bubbleSort;
	
	@Autowired
	ISort quickSort;
	
	@Bean
	public BinarySearchImpl bubbleImpl() {
		return new BinarySearchImpl(bubbleSort);
	}

	@Bean
	public BinarySearchImpl quickImpl() {
		return new BinarySearchImpl(quickSort);
	}
}
