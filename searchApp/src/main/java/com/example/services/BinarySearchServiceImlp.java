package com.example.services;

import com.example.sort.Isort;

//@Component
public class BinarySearchServiceImlp {
	
	public BinarySearchServiceImlp(Isort isort) {
		super();
		this.isort=isort;
		
	}

	Isort isort;

	public boolean sorting(int[] a) {

		isort.sort(a);

		return true;

	}

}
