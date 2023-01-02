package com.assignment.jpa.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.assignment.jpa.entity.author;
import com.assignment.jpa.repository.authorRepository;
import com.assignment.jpa.service.authorService;
@Component
public class authorServiceImpl implements authorService{
	
	@Autowired
	private authorRepository authorRepo;

	@Override
	public author saveAuthor(author author) {
		// TODO Auto-generated method stub
		author a1 = this.authorRepo.save(author);
		
		return a1;
	}

	@Override
	public author getAuthor(int id) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		author a2 = this.authorRepo.getById(id);
		
		return a2;
	}

	@Override
	public List<author> getAllAuthors() {
		// TODO Auto-generated method stub
		List<author> a3 = this.authorRepo.findAll();
		return a3;
	}

	@Override
	public author updateAuthor(int id, author author) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		author a4 = this.authorRepo.getById(id);
		a4.setFirstName(author.getFirstName());
		a4.setMiddleName(author.getMiddleName());
		a4.setLastName(author.getLastName());
		a4.setPhoneNo(author.getPhoneNo());
		this.authorRepo.save(a4);
		return a4;
	}

	@Override
	public String deleteAuthor(int id) {
		// TODO Auto-generated method stub
		this.authorRepo.deleteById(id);
		
		return "Author Deleted Successfully";
	}

}
