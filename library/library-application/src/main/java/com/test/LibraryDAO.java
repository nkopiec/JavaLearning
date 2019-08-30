package com.test;

import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {
	List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> getBooks() {
		return books;
	}
}
