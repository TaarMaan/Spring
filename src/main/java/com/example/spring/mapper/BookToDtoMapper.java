package com.example.spring.mapper;

import com.example.spring.model.BookRequest;
import com.example.spring.model.Title;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Title AddTitleRequestToBook(BookRequest bookRequest);

    Title EditTitleRequestToBook(Long id, BookRequest bookRequest);
}