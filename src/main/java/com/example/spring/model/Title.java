package com.example.spring.model;

import lombok.Value;

@Value
public class Title {
    Long id;
    String category;
    String name;
    String rating;
}
