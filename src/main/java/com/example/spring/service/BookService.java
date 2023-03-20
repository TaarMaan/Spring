package com.example.spring.service;


import com.example.spring.mapper.BookToDtoMapper;
import com.example.spring.model.Title;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

public class BookService {
    public Title getTitleById(Long id) {
        return null;
    }


    public List<Title> findByName(String name) {
        return null;
    }

    public List<Title> findByRating(Double rating) {
        return null;
    }

    public List<Title> findByCategory(String category) {
        return null;
    }

    public void addTitle(Title Title) {
    }

    public List<Title> getAllTitles() {
        return null;
    }

    public Title show(Long id) {
        return null;
    }

    public void delete(Long id) {
        //@Query
    }

    public void save(Title title) {
        //@Query
    }

    public void update(Long id, Title updatedTitle) {
        //@Query
    }
}
