package com.example.spring.mapper;

import com.example.spring.model.Title;
import com.example.spring.dao.BookEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToTitleEntity(Title Title);

    Title bookEntityToTitle(BookEntity bookEntity);
}
