package com.action;

import com.sort.Bubblesort;
import com.sort.QuickSort;
import com.sort.SortImpl;

public class BinarySearch {

	SortImpl bubblesortImpl;
	SortImpl quicksortImpl;

	public static final String binary = "bubble";

	public boolean binaryOpretion() {

		int a[] = { 3, 5, 6, 8 };

		previewBubblesort(a);
		perviewQuicksort(a);

		return false;

	}

	private void perviewQuicksort(int[] a) {
		quicksortImpl = new QuickSort();
		quicksortImpl.sort(a);
	}

	private void previewBubblesort(int[] a) {
		bubblesortImpl = new Bubblesort();
		bubblesortImpl.sort(a);
	}

	public SortImpl getBubblesortImpl() {
		return bubblesortImpl;
	}

	public void setBubblesortImpl(SortImpl bubblesortImpl) {
		this.bubblesortImpl = bubblesortImpl;
	}

	public SortImpl getQuicksortImpl() {
		return quicksortImpl;
	}

	public void setQuicksortImpl(SortImpl quicksortImpl) {
		this.quicksortImpl = quicksortImpl;
	}

}
