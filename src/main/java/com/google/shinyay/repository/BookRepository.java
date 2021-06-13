package com.google.shinyay.repository;

import com.google.shinyay.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
