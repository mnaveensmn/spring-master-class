package com.naveen.beans;

public class Product implements Cloneable {
	public int id;
	public String name;
	public float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}