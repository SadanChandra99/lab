package com.assignment.jpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private int price;
	
	@JoinColumn(name = "joined-book-author")
	@OneToOne(cascade = CascadeType.ALL)
	private author author;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public author getAuthor() {
		return author;
	}
	public void setAuthor(author author) {
		this.author = author;
	}
	public book(int bookId, String name, int price, com.assignment.jpa.entity.author author) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.author = author;
	}
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "book [bookId=" + bookId + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
	
	
}
