package com.example.spring.repository;

import com.example.spring.dao.BookEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookEntity, Long> {
    /**
     * Репозиторий, необходимый для загрузки/сохранения записей в таблицу
     * Наследование от CRUD, позволяет получить функциональность:
     * create,read, update, delete.
     */
    List<BookEntity> findAllByNameContaining(String name);

    List<BookEntity> findAllByCategoryContaining(String category);

    List<BookEntity> findAllByRatingContaining(String rating);

}
