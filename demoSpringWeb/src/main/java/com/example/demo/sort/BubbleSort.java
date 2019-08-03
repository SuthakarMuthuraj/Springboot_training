package com.example.demo.sort;

import org.springframework.stereotype.Component;

@Component

public class BubbleSort implements ISort{
	
	public int[] sort(int[]  Bubblesorted) {
		System.out.println("Bubble Sorted");
		return Bubblesorted;
	}

}

