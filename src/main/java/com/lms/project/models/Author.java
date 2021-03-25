package com.lms.project.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
String name;
int age;
@ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
@JoinTable(
  name = "author_books", 
  joinColumns = @JoinColumn(name = "author_id"), 
  inverseJoinColumns = @JoinColumn(name = "book_id"))
Set<Book> books;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Set<Book> getBooks() {
	return books;
}
public void setBooks(Set<Book> books) {
	this.books = books;
}
}
