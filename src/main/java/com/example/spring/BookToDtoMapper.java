package com.example.spring;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
}
