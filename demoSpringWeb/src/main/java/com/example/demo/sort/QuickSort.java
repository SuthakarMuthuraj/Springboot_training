package com.example.demo.sort;

import org.springframework.stereotype.Component;

@Component

public class QuickSort implements ISort{
	public int[] sort(int[]  QuickSorted) {
		System.out.println("Quick Sorted");
		return QuickSorted;
	}
}
