package com.google.shinyay;

import com.google.shinyay.entity.Book;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.http.MediaType;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class BookTest {

    private static final String BOOK_API = "http://localhost:8080/api/v1/books";
    private Book createBooksForTests() {
        Book book = new Book();
        book.setTitle(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));
        return book;
    }

    private String createBookViaRest(Book book) {
        Response response = RestAssured
                .given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(book)
                .post(BOOK_API);
        return BOOK_API + "/" + response.jsonPath().get("id");
    }
}
