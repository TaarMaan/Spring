package com.example.spring.model;

import lombok.Data;

@Data
public class BookRequest {
    /**
     * BookRequest - класс, описывающий запрос пользователя ( data transfer object ).
     */
    private String category;
    private String name;
    private String rating;
}
