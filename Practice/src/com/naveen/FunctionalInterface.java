package com.naveen;

public interface FunctionalInterface {

	public String method1(String arg1, String arg2);

	default void show() {
		System.out.println("Default Method Executed");
	}

	static void show2() {
		System.out.println("Default Method Executed");
	}
}
