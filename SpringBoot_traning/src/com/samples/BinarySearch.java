package com.samples;

import com.samples.sortAlg.SortInterface;

public class BinarySearch {

	public static final String BUBBLE_SORT = "bubble";
	public static final String QUICK_SORT = "bubble";

	SortInterface sortInterface;

	public boolean Search(int a[], int b, SortInterface interface1) {

		System.out.println("binary number");
		System.out.println("complex binary number");

		/*if (BUBBLE_SORT.equals(interface1)) {

			sortInterface.sort(a);

		} else {
			sortInterface.sort(a);

		}*/
		
		interface1.sort(a);

		return true;

	}

}
