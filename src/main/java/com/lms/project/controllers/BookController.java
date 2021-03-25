package com.lms.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.lms.project.dao.BookRepo;
import com.lms.project.models.Book;
import com.lms.project.services.BookServices;
@RestController
public class BookController {
	@Autowired
	public BookServices bookServices;
	@Autowired
	public BookRepo bookRepo;

	@GetMapping("/api/book/count")
	public ResponseEntity<?> count() {
		long result = bookServices.count();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/api/book/findById/{id}")
	public ResponseEntity<Optional<Book>> findById(@PathVariable Long id) {
		Optional<Book> result = bookServices.findById(id);
		return new ResponseEntity<Optional<Book>>(result, HttpStatus.OK);
	}

	@GetMapping("/api/book/findAll")
	public ResponseEntity<Iterable<Book>> findAll() {
		Iterable<Book> result = bookServices.findAll();
		return new ResponseEntity<Iterable<Book>>(result, HttpStatus.OK);
	}

	@DeleteMapping("/api/book/deleteById/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		bookServices.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/api/book/deleteAll")
	public ResponseEntity<Void> deleteAll() {
		bookServices.deleteAll();
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
