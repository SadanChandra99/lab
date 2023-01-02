package com.assignment.jpa.service;

import java.util.List;

import com.assignment.jpa.entity.author;

public interface authorService {

	public author saveAuthor(author author);
	
	public author getAuthor(int id);
	
	public List<author> getAllAuthors();
	
	public author updateAuthor(int id, author author);
	
	public String deleteAuthor(int id);
}
