package com.example.spring.mapper;

import com.example.spring.model.Title;
import com.example.spring.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Title AddBookRequestToTitle(BookRequest bookRequest);
}
