package com.training;

import java.io.Serializable;

public class Book implements Serializable {
	private int bookNumber;
	private String bookNmae;
	private String author;
	private transient double price;
	public Book() {
		super();
		System.out.println("book initialised");
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String bookNmae, String author, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookNmae = bookNmae;
		this.author = author;
		this.price = price;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookNmae() {
		return bookNmae;
	}
	public void setBookNmae(String bookNmae) {
		this.bookNmae = bookNmae;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookNmae=" + bookNmae + ", author=" + author + "]";
	}
	

}
