package com.example.spring.mapper;

import com.example.spring.model.BookRequest;
import com.example.spring.model.Title;
import org.mapstruct.Mapper;

import java.awt.print.Book;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    /**
     * Mapper для получения данных из объекта класса BookRequest.
     */
    Title AddTitleRequestToBook(BookRequest bookRequest);

    Title EditTitleRequestToBook(Long id, BookRequest bookRequest);

}