package com.google.shinyay.controller;

import com.google.shinyay.entity.Book;
import com.google.shinyay.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/books")
    public Iterable findAll() {
        return repository.findAll();
    }

    @GetMapping("/books/{title}")
    public List findByTitle(@PathVariable String title) {
        return repository.findBookByTitle(title);
    }

    @GetMapping("/books/{id}")
    public Book findOneBook(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow();
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@RequestBody Book book) {
        return repository.save(book);
    }

}
