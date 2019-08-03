package com.samples;

import com.samples.sortAlg.SortInterface;

public class BinarySearch {

	public static final String BUBBLE_SORT = "bubble";
	public static final String QUICK_SORT = "bubble";

	SortInterface sortInterface = null;

	public boolean Search(int a[], int b) {

		System.out.println("binary number");
		System.out.println("complex binary number");

		/*
		 * if (BUBBLE_SORT.equals(interface1)) {
		 * 
		 * sortInterface.sort(a);
		 * 
		 * } else { sortInterface.sort(a);
		 * 
		 * }
		 */

		sortInterface.sort(a);

		return true;

	}

	public SortInterface getSortInterface() {
		return sortInterface;
	}

	public void setSortInterface(SortInterface sortInterface) {
		this.sortInterface = sortInterface;
	}

}
