package com.naveen.springtutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.naveen.springtutorial.basic.BinarySearch;

@Configuration
@ComponentScan
public class SpringBasicApplication {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringBasicApplication.class)) {
			
			BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class,  (Object[])null);
			BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class,  (Object[])null);
			
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			
			System.out.println(binarySearch.sortAndSearch(new int[] {1}, 3));
			
		}
		
	}
}
