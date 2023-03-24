package com.example.spring.service;

import com.example.spring.model.Title;

import java.util.List;

public interface BookService {
    /**
     * BookService - сервис (интерфейс) с основным функционалом записной книжки
     */
    Title getTitleById(Long id);

    List<Title> findByName(String name);

    List<Title> findByRating(String rating);

    List<Title> findByCategory(String category);

    List<Title> getAllTitles();

    void addTitle(Title title);

    void editTitle(Title title);

    void deleteTitle(Long id);
}
