package com.example.spring.model;

import lombok.Value;

@Value
public class Title {
    /**
     * Data-класс записная "книга"
     * immutable гетеры,конструкторы при помощи @Value
     */
    Long id;
    String category;
    String name;
    String rating;
}
