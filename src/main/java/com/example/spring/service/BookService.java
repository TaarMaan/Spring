package com.example.spring.service;

import com.example.spring.model.Title;

import java.util.List;

public interface BookService {
    Title getTitleById(Long id);
    List<Title> findByName(String name);
    List<Title> findByRating(Double rating);
    List<Title> findByCategory(String category);
    List<Title> getAllTitles();
    void addTitle(Title title);
    void editTitle(Title title);

}
