package PaqueteBook;

import PaqueteAuthor.Author;

public class Book {

	private String name;
	private Author author;
	private double price;
	private int qty;

	// Constructor sin cantidad
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = 0;
	}

	// Constructor con cantidad
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public Author getAuthor() {
		return this.author;
	}

	public double getPrice() {
		return this.price;
	}

	public int getQty() {
		return this.qty;
	}

	// Setters
	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
	}
}