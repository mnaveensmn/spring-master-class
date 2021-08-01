package com.naveen.springtutorial.basic;

import org.springframework.stereotype.Service;

@Service
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public void sort() {
		System.out.println("Sorted");
	}

}
