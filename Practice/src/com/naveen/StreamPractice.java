package com.naveen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void map() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");

		List<Integer> s = list.stream().map(a -> (int) (a.charAt(0))).collect(Collectors.toList());
		System.out.println(s);

		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		long count = number.stream().filter(x -> x % 2 == 0).count();
		System.out.println(even);
		System.out.println(count);
	}

	public static void main(String[] args) {
		map();
	}
}
