package com.naveen.springtutorial.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {

	@Autowired
	SortAlgorithm bubbleSortAlgorithm;
	
	public int sortAndSearch(int[] a, int key) {
		bubbleSortAlgorithm.sort();
		System.out.println(bubbleSortAlgorithm);
		System.out.println("Searched");
		return key;
	}
	
	@PostConstruct
	public void postContruct() {
		System.out.println("Post Contruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre Destroy");
	}
	
}
