package com.assignment.jpa.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assignment.jpa.entity.book;
import com.assignment.jpa.repository.bookRepository;
import com.assignment.jpa.service.bookService;
@Component
public class bookServiceImpl implements bookService{
	
	@Autowired
	private bookRepository bookrepo;

	@Override
	public book saveBook(book book) {
		// TODO Auto-generated method stub
		book b1 = this.bookrepo.save(book);
		return b1;
	}

	@Override
	public List<book> getAllBooks() {
		// TODO Auto-generated method stub
		List<book> books = this.bookrepo.findAll();
		return books;
	}

	@Override
	public book getBook(int id) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		book b2 = this.bookrepo.getById(id);
		return b2;
	}

	@Override
	public book updateBook(int id, book book) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		book b3 = this.bookrepo.getById(id);
		b3.setName(book.getName());
		b3.setPrice(book.getPrice());
		b3.setAuthor(book.getAuthor());
		this.bookrepo.save(b3);
		return b3;
	}

	@Override
	public String deleteBook(int id) {
		// TODO Auto-generated method stub
		this.bookrepo.deleteById(id);
		return "book deleted successfully";
	}

}
