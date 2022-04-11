package com.reetu.beans;

public class JavaBook {
	private double price;
	private String name;
	private String author;
	public JavaBook(double price, String name, String author) {
		super();
		this.price = price;
		this.name = name;
		this.author = author;
	}
	public JavaBook(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
}
