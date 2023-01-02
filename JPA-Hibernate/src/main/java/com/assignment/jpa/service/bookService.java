package com.assignment.jpa.service;

import java.util.List;

import com.assignment.jpa.entity.book;

public interface bookService {
	
	public book saveBook(book book);
	
	public List<book> getAllBooks();
	
	public book getBook(int id);
	
	public book updateBook(int id, book book);
	
	public String deleteBook(int id);

}
