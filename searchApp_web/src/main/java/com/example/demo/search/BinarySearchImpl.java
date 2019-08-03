package com.example.demo.search;

import com.example.demo.sort.ISort;

//@Component
public class BinarySearchImpl {

	public BinarySearchImpl(ISort sortImplementation) {
		super();
		// TODO Auto-generated constructor stub
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
