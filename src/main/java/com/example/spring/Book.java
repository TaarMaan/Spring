package com.example.spring;

import lombok.Value;

@Value
public class Book {
    Long id;
    String category;
    String nameTitle;
    Double rating;
}
