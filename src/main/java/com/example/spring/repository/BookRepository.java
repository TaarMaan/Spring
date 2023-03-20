package com.example.spring.repository;

import com.example.spring.dao.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {
    List<BookEntity> findAllByNameTitleContaining(String name);
}
