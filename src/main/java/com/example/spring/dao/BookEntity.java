package com.example.spring.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "titles", indexes = {
        @Index(name = "idx_titles_category", columnList = "category"),
        @Index(name = "idx_titles_name", columnList = "name"),
        @Index(name = "idx_titles_rating", columnList = "rating")
})
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String category;

    private String name;

    private Double rating;
}
