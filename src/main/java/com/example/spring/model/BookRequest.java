package com.example.spring.model;

import lombok.Data;
@Data
public class BookRequest {
    private String category;
    private String nameTitle;
    private Double rating;
}
