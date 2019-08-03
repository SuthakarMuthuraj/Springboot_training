package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

	@Autowired
	BinarySearchServiceImlp bubbleSearchServiceImlp;

	@Autowired
	BinarySearchServiceImlp quickSearchServiceImlp;

	public void search() {

		int a[] = { 5, 7, 2, 9 };

		previewBubblesort(a);
		perviewQuicksort(a);

	}

	private void perviewQuicksort(int[] a) {

		bubbleSearchServiceImlp.sorting(a);

	}

	private void previewBubblesort(int[] a) {

		quickSearchServiceImlp.sorting(a);
	}

}
