package com.assignment.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authId;
	
	public book getBook() {
		return book;
	}
	public void setBook(book book) {
		this.book = book;
	}
	private String firstName;
	private String middleName;
	private String lastName;
	private Long phoneNo;
	@OneToOne(mappedBy = "author")
	private book book;
	
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public author(int authId, String firstName, String middleName, String lastName, Long phoneNo,
			com.assignment.jpa.entity.book book) {
		super();
		this.authId = authId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.book = book;
	}
	@Override
	public String toString() {
		return "author [authId=" + authId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", phoneNo=" + phoneNo + ", book=" + book + "]";
	}
	
	
	
	
	

}
