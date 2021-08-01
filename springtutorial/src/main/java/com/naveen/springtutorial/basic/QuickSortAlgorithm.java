package com.naveen.springtutorial.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	@Override
	public void sort() {
		System.out.println("Sorted");
	}
}
