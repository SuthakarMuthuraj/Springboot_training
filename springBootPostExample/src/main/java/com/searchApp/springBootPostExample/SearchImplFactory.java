package com.searchApp.springBootPostExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.searchApp.springBootPostExample.search.BinarySearchImpl;
import com.searchApp.springBootPostExample.sort.ISort;

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
