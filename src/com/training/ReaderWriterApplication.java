package com.training;

public class ReaderWriterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(777,"Python Programming","Yashwant Kanetkar",213);
		BookReaderWriter brw=new BookReaderWriter();
		brw.addBooks(book);
		brw.printBooks();

	}

}
