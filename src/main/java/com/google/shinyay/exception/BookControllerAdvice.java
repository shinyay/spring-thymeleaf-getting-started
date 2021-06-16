package com.google.shinyay.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BookControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler({BookNotFoundException.class})
    public ResponseEntity<Object> handleNotFoundBook() {
        
    }

}