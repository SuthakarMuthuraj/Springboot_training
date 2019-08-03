package com.example.searchApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.services.BinarySearchServiceImlp;
import com.example.sort.BubbleSort;
import com.example.sort.QuickSort;

@Configuration
public class SearchImplFactory {
	
	@Autowired
	BubbleSort bubbleSort;
	
	@Autowired
	QuickSort quickSort;
	
	
	@Bean
	public BinarySearchServiceImlp bubbleSearchServiceImlp() {
		return new BinarySearchServiceImlp(bubbleSort);
	}
	
	@Bean
	public BinarySearchServiceImlp quickSearchServiceImlp() {
		return new BinarySearchServiceImlp(quickSort);
	}


}
