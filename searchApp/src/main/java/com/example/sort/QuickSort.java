package com.example.sort;

import org.springframework.stereotype.Component;

@Component("quickSort")
public class QuickSort implements Isort{

	@Override
	public void sort(int[] a) {

		System.out.println("Quick Sort");
	}

}
