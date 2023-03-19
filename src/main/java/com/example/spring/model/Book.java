package com.example.spring.model;

import lombok.Value;

@Value
public class Book {
    Long id;
    String category;
    String nameTitle;
    Double rating;
}
