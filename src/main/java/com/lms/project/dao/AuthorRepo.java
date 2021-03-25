package com.lms.project.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.lms.project.models.Author;
@Repository
public interface AuthorRepo extends CrudRepository<Author, Long>{

}
