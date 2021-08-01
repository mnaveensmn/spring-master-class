package com.naveen;

import com.naveen.beans.Product;

public class ImmutableClass {

	private String id;
	private String name;
	private final Product product;

	// Deep Copy
	public ImmutableClass(String id, String name, Product product) {
		super();
		this.id = id;
		this.name = name;
		Product tempProduct = new Product(product.id, product.name, product.price);
		this.product = tempProduct;
	}

	/*
	 * // Shallow Copy public ImmutableClass(String id, String name, Product
	 * product) { super(); this.id = id; this.name = name; Product tempProduct = new
	 * Product(product.id, product.name, product.price); this.product = tempProduct;
	 * }
	 */

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Product getProduct() {
		try {
			return (Product) product.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		Product product = new Product(1, "MI", 13000);
		ImmutableClass immutableClass = new ImmutableClass("001", "Phone", product);
		product.name = "Redmi Note 4";
		System.out.println(immutableClass.product.name);

		product = immutableClass.getProduct();
		product.name = "Redmi Note 4";
		System.out.println(immutableClass.product.name);
	}
}
