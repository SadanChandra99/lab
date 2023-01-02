package com.assignment.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.jpa.entity.author;
import com.assignment.jpa.serviceImpl.authorServiceImpl;


@RestController
public class authorController {
	
	@Autowired
	private authorServiceImpl impl;
	
	@PostMapping(value = "/save")
	public ResponseEntity<author> saveAuthor(@RequestBody author author){
		author auth1 = this.impl.saveAuthor(author);
		return ResponseEntity.ok(auth1);
		
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<author> getAuthor(@PathVariable int id){
		author auth2 = this.impl.getAuthor(id);
		return ResponseEntity.ok(auth2);
	}
	
	@GetMapping(value = "/get")
	public ResponseEntity<List<author>> getAllAuthors(){
		List<author> auth3 = this.impl.getAllAuthors();
		return ResponseEntity.ok(auth3);
	}
	
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<author> updateAuthor(@PathVariable int id, @RequestBody author author){
		author auth4 = this .impl.updateAuthor(id, author);
		return new ResponseEntity<author>(auth4, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteAuthor(@PathVariable int id){
		this.impl.deleteAuthor(id);
		return ResponseEntity.ok("AUTHOR DELETED");
	}

}