package com.example.sort;

import org.springframework.stereotype.Component;

@Component("bubbleSort")
public class BubbleSort implements Isort {

	@Override
	public void sort(int[] a) {

		System.out.println("Bubble Sort");
	}

}
