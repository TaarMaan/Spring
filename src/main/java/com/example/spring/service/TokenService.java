package com.example.spring.service;

public interface TokenService {
    /**
     * Интерфейс/сервис по проверке и выдаче токена сессии клиенту
     */
    boolean checkToken(String token);
}
