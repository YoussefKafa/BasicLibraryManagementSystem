package com.lms.project.controllers;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.catalina.authenticator.SavedRequest;
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
import com.lms.project.dao.AuthorRepo;
import com.lms.project.models.Author;
import com.lms.project.services.AuthorServices;

@RestController
public class AuthorController {
	@Autowired
	public AuthorServices authorServices;
	@Autowired
	public AuthorRepo authorRepo;
@PostMapping("/api/author/save")
public Author save(@Valid @RequestBody Author author){
return authorServices.saveOrUpdate(author);
}
	@GetMapping("/api/author/count")
	public ResponseEntity<?> count() {
		long result = authorServices.count();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/api/author/findById/{id}")
	public ResponseEntity<Optional<Author>> findById(@PathVariable Long id) {
		Optional<Author> result = authorServices.findById(id);
		return new ResponseEntity<Optional<Author>>(result, HttpStatus.OK);
	}

	@GetMapping("/api/author/findAll")
	public ResponseEntity<Iterable<Author>> findAll() {
		Iterable<Author> result = authorServices.findAll();
		return new ResponseEntity<Iterable<Author>>(result, HttpStatus.OK);
	}

	@DeleteMapping("/api/author/deleteById/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		authorServices.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/api/author/deleteAll")
	public ResponseEntity<Void> deleteAll() {
		authorServices.deleteAll();
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
