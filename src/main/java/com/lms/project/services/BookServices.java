package com.lms.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lms.project.dao.BookRepo;
import com.lms.project.models.Book;

@Service
public class BookServices {
	@Autowired
	public BookRepo bookRepo;

	public Book saveOrUpdate(final Book book) {
		return bookRepo.save(book);
	}

	public long count() {
		return bookRepo.count();
	}

	public void deleteById(Long id) {
		bookRepo.deleteById(id);
	}

	public void deleteAll() {
		bookRepo.deleteAll();
	}

	public Optional<Book> findById(long id) {
		return bookRepo.findById(id);
	}

	public Iterable<Book> findAll() {
		return bookRepo.findAll();
	}
}
