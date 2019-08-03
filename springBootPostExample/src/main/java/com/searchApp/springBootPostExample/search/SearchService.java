package com.searchApp.springBootPostExample.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.searchApp.springBootPostExample.entity.SearchSet;
import com.searchApp.springBootPostExample.repository.SearchSetRepository;

@Service
public class SearchService {

	@Autowired
	BinarySearchImpl bubbleImpl;

	@Autowired
	BinarySearchImpl quickImpl;

	@Autowired
	SearchSetRepository repository;

	public boolean search(int numberToBeSearched) {
		System.out.println("inside search BinarySearchApp");
		int[] noArray = { 1, 2, 3 };

		// performQuickSortSearch(noArray);
		return performBubbleSortSearch(noArray, numberToBeSearched);
	}

	private void performQuickSortSearch(int[] noArray) {
		System.out.println("inside search performQuickSortSearch");
		boolean result;
		// BinarySerachImpl binarySearch = buildBinarySearchImpl(bubble);
		result = quickImpl.search(noArray, 2);
		System.out.println("done searching for quick :" + result);
	}

	private boolean performBubbleSortSearch(int[] noArray, int numberToBeSearched) {
		System.out.println("inside search performBubbleSortSearch");
		boolean result;
		result = bubbleImpl.search(noArray, numberToBeSearched);
		System.out.println("done searching for bubble :" + result);
		return result;
	}

	public SearchSet saveSearchSet(SearchSet newSearchSet) {

		return repository.save(newSearchSet);
	}

}
