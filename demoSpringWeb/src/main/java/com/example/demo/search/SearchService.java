package com.example.demo.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
	
	@Autowired
	BinarySearchImpl bubbleImpl;
	
	@Autowired
	BinarySearchImpl quickImpl;
	
	public void search() {
		System.out.println("inside search BinarySearchApp");
		int[] noArray = {1,2,3};
		performBubbleSortSearch(noArray);
		performQuickSortSearch(noArray);
	}
	
	private  void performQuickSortSearch(int[] noArray) {
		System.out.println("inside search performQuickSortSearch");
		boolean result;
		//BinarySerachImpl binarySearch = buildBinarySearchImpl(bubble);
		result = quickImpl.search(noArray, 2);
		System.out.println("done searching for quick :"+result);
	}

	private void  performBubbleSortSearch(int[] noArray) {
		System.out.println("inside search performBubbleSortSearch");
		boolean result;
		//BinarySerachImpl binarySearch = buildBinarySearchImpl(quick);
		result = bubbleImpl.search(noArray, 2);
		System.out.println("done searching for bubble :"+result);
	}

}
