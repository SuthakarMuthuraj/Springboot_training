/**
 * 
 */
package com.samples;

import com.samples.sortAlg.BubbleSort;
import com.samples.sortAlg.QuickSort;
import com.samples.sortAlg.SortInterface;

/**
 * @author test
 *
 */
public class BinaryApp {

	public static void main(String[] args) {

		int a[] = { 10, 45, 24, 8 };

		BinarySearch binarySearch = new BinarySearch();

		SortInterface interface1 = new BubbleSort();

		boolean result = binarySearch.Search(a, 90, interface1);

		System.out.println("bubble result is :-" + result);

		interface1 = new QuickSort();

		result = binarySearch.Search(a, 80, interface1);

		System.out.println("Quick result is :-" + result);
	}

}
