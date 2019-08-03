package com.activeMQ.SpringBootActiveMQ.sort;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements ISort{

	@Override
	public void sort(int[] no) {
		System.out.println("Quick Sorted");
		
	}

}
