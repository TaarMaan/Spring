package com.example.spring.exception;

public class TitleNotFoundException extends RuntimeException{

    public TitleNotFoundException(String message) {
        super(message);
    }

    /*public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }*/
}