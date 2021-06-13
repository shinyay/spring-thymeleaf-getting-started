package com.google.shinyay.repository;

import com.google.shinyay.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findBookByTitle(String title);
}
