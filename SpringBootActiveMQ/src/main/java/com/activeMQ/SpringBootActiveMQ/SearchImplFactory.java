package com.activeMQ.SpringBootActiveMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.activeMQ.SpringBootActiveMQ.search.BinarySearchImpl;
import com.activeMQ.SpringBootActiveMQ.sort.ISort;

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
