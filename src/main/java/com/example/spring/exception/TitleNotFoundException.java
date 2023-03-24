package com.example.spring.exception;

public class TitleNotFoundException extends RuntimeException {
    /**
     * Класс выводящий сообщение ошибок
     */

    public TitleNotFoundException(String message) {
        super(message);
    }

    public TitleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}