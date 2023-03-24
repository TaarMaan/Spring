package com.example.spring.mapper;

import com.example.spring.model.Title;
import com.example.spring.dao.BookEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    /**
     * Ввиду того, что класс Title - класс сервисного слоя, а BookEntity - DAO, необходим маппер,
     * который перекладывал бы данных из объектов.
     * Слоев DAO может быть много, исходя из этой логики и добавляются слои DAO и мапперы.
     * @Mapper с аргументом componentModel = "spring" - позволит Spring'у понять,
     * что нужно создать бин данного класса.
     */
    BookEntity bookToTitleEntity(Title Title);

    Title bookEntityToTitle(BookEntity bookEntity);
}
