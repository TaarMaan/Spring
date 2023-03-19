package com.example.spring.repository;

import com.example.spring.dao.BookEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookEntity, Long> {
    List<BookEntity> findAllByNameTitleContaining(String name);
}
