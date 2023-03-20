package com.example.spring.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Value;

@Value
public class Title {
    Long id;
    @NotEmpty(message = "Поле категории не может быть пустым")
    String category;
    @NotEmpty(message = "Поле имя не может быть пустым")
    String nameTitle;
    Double rating;
}
