package com.naveen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.naveen.beans.Product;

public class LambdaExpressions {



	public static void main(String[] args) {


		FunctionalInterface3 fi3 = () -> Math.random();

		System.out.println(fi3.method1());

		// Same using supplier

		Supplier<Double> supplier = () -> Math.random();

		System.out.println(supplier.get());

		// ----------- Multiple Argument -----------
		FunctionalInterface fi = (arg1, arg2) -> {
			return arg1 + " " + arg2;
		};
		System.out.println(fi.method1("Naveen", "Kumar"));
		fi.show();
		FunctionalInterface.show2();
		// -------- Method without return statement ------
		
		FunctionalInterface2 fi2 = (c, b) -> (c + b);

		System.out.println(fi2.method1(10, 20));

		// ------------- Lambda in forEach -------------

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");

		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});
		
		list.forEach((n) -> {
			System.out.println(n);
		});
		
		// ------------- Lambda in Thread -------------
		
		Runnable runnable = () -> {
			System.out.print("New Thread");
		};

		Thread thread = new Thread(runnable);
		thread.start();
		
		Runnable r = () -> System.out.println("Running..");

		new Thread(r);

		// ------------------ Filtering Data ---------------------------

		List<Product> products = new ArrayList<Product>();

		products.add(new Product(1, "Samsung A5", 17000f));
		products.add(new Product(3, "Iphone 6S", 65000f));
		products.add(new Product(2, "Sony Xperia", 25000f));
		products.add(new Product(4, "Nokia Lumia", 15000f));
		products.add(new Product(5, "Redmi4 ", 26000f));
		products.add(new Product(6, "Lenevo Vibe", 19000f));

		// using lambda to filter data
		Stream<Product> filtered_data = products.stream().filter(p -> p.price > 20000);

		// using lambda to iterate through collection
		filtered_data.forEach(product -> System.out.println(product.name + ": " + product.price));


	}
}
