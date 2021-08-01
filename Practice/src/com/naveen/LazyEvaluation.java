package com.naveen;

import java.util.function.Supplier;

public class LazyEvaluation {

	static boolean compute(String str) {
		System.out.println("executing...");
		return str.contains("a");
	}

	static String lazyMatch(Supplier<Boolean> a, Supplier<Boolean> b) {
		if (a.get() && b.get())
			return "match";
		else
			return "incompatible!";
	}

	public static void main(String[] args) {
		System.out.println(lazyMatch(() -> compute("bb"), () -> compute("aa")));

		if (compute("bb") && compute("aa")) {

		}
	}

}
