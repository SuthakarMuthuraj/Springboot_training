package com.searchApp.springBootPostExample.search;

import com.searchApp.springBootPostExample.sort.ISort;

public class BinarySearchImpl {
	
	
	public BinarySearchImpl(ISort sortImplementation) {
		super();
		this.sortImplementation = sortImplementation;
	}

	ISort sortImplementation;

	public boolean search(int[] no, int searched) {
		System.out.println("inside search method");

		boolean result = false;

		sortImplementation.sort(no);

		for (int nos : no) {

			if (nos == searched) {

				result = true;

			}

		}

		System.out.println("doing searching in BinarySerachImpl");
		return result;
	}

}
