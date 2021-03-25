package com.lms.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lms.project.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long>{

}
