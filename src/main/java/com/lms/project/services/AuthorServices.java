package com.lms.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lms.project.dao.AuthorRepo;
import com.lms.project.models.Author;

@Service
public class AuthorServices {
	@Autowired
	public AuthorRepo authorRepo;

	public Author saveOrUpdate(final Author author) {
		return authorRepo.save(author);
	}

	public long count() {
		return authorRepo.count();
	}

	public void deleteById(Long id) {
		authorRepo.deleteById(id);
	}

	public void deleteAll() {
		authorRepo.deleteAll();
	}

	public Optional<Author> findById(long id) {
		return authorRepo.findById(id);
	}

	public Iterable<Author> findAll() {
		return authorRepo.findAll();
	}
}
