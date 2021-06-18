package com.google.shinyay;

import com.google.shinyay.entity.Book;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class BookTest {

    private static final String BOOK_API = "http://localhost:8080/api/v1/books";
    private Book createBooksForTests() {
        Book book = new Book();
        book.setTitle(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));
        return book;
    }
}
