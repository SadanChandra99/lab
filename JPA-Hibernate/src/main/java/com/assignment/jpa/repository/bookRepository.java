package com.assignment.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.jpa.entity.book;

public interface bookRepository extends JpaRepository<book, Integer>{

}
