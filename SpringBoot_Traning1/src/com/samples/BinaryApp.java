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

	BinarySearch binarySearchimpl;

	BinarySearch quickSearchimpl;


	public void search() {
		int a[] = { 10, 45, 24, 8 };

		performbubblesort(a);

		performquicksort(a);
	}

	private static void performquicksort(int[] a) {
		BinarySearch binarySearch = new BinarySearch();
		SortInterface interface1;
		boolean result;
		interface1 = new QuickSort();
		binarySearch.setSortInterface(interface1);
		result = binarySearch.Search(a, 80);

		System.out.println("Quick result is :-" + result);
	}

	private static void performbubblesort(int[] a) {
		BinarySearch binarySearch = new BinarySearch();
		SortInterface interface1 = new BubbleSort();
		binarySearch.setSortInterface(interface1);
		boolean result = binarySearch.Search(a, 90);

		System.out.println("bubble result is :-" + result);
	}

	public BinarySearch getBinarySearchimpl() {
		return binarySearchimpl;
	}

	public void setBinarySearchimpl(BinarySearch binarySearchimpl) {
		this.binarySearchimpl = binarySearchimpl;
	}

	public BinarySearch getQuickSearchimpl() {
		return quickSearchimpl;
	}

	public void setQuickSearchimpl(BinarySearch quickSearchimpl) {
		this.quickSearchimpl = quickSearchimpl;
	}

}
