package com.lms.project.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
String name;
String genre;
@ManyToMany(mappedBy = "books")
Set<Author> authors;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Set<Author> getAuthors() {
	return authors;
}
public void setAuthors(Set<Author> authors) {
	this.authors = authors;
}
}
