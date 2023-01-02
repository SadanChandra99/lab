package com.assignment.jpa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.jpa.entity.book;
import com.assignment.jpa.serviceImpl.bookServiceImpl;

@RestController
public class bookController {
	
	@Autowired
	private bookServiceImpl impl;
	
	@PostMapping(value = "/v1/save")
	public book saveBook(book book) {
		book b1 = this.impl.saveBook(book);
		return b1;
		
	}
	
	@GetMapping(value = "/v1/get/{id}")
	public book getbook (@PathVariable int id) {
		book b2 = this.impl.getBook(id);
		return b2;
	}
	
	@GetMapping(value = "/v1/get")
	public List<book> getAllbooks(){
		List<book> list = this.impl.getAllBooks();
		return list;
	}
	
	@PutMapping(value = "/v1/update/{id}")
	public book updatebook(@PathVariable int id, @RequestBody book book) {
		book b3 = this.impl.updateBook(id, book);
		return b3;
	}
	
	@DeleteMapping(value = "/v1/delete/{id}")
	public String deletebook(@PathVariable int id) {
		this.impl.deleteBook(id);
		return "BOOK DELETED";
	}

}
