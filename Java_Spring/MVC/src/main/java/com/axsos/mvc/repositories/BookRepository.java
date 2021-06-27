package com.axsos.mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
