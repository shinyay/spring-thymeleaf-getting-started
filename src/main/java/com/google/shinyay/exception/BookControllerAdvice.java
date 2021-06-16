package com.google.shinyay.exception;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BookControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler({BookNotFoundException.class})
    public ResponseEntity<Object> handleNotFoundBook(Exception e, WebRequest request) {
        return handleExceptionInternal(
                e,
                "The book is not found",
                new HttpHeaders(),
                HttpStatus.NOT_FOUND,
                request);
    }

    @ExceptionHandler({BookMismatchException.class,
            DataIntegrityViolationException.class,
            ConstraintViolationException.class})
    public ResponseEntity<Object> handleBadRequest(Exception e, WebRequest request) {
        return handleExceptionInternal(
                e,
                e.getLocalizedMessage(),
                new HttpHeaders(),
                HttpStatus.BAD_REQUEST,
                request);
    }
}