package com.google.shinyay;

import com.google.shinyay.entity.Book;

public class BookTest {

    private static final String BOOK_API = "http://localhost:8080/api/v1/books";
    private Book createBooksForTests() {
        Book book = new Book();
        return book;
    }
}
