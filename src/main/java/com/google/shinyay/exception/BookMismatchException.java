package com.google.shinyay.exception;

public class BookMismatchException extends RuntimeException {

    public BookMismatchException() {
        super();
    }

    public BookMismatchException(String message) {
        super(message);
    }

    public BookMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookMismatchException(Throwable cause) {
        super(cause);
    }

    public BookMismatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
