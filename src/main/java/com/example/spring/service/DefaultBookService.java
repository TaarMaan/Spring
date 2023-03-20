package com.example.spring.service;

import com.example.spring.dao.BookEntity;
import com.example.spring.exception.TitleNotFoundException;
import com.example.spring.mapper.BookToEntityMapper;
import com.example.spring.model.Title;
import com.example.spring.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class DefaultBookService extends BookService {
    private final BookRepository bookRepository;
    private final BookToEntityMapper mapper;

    @Override
    public Title getTitleById(Long id) {
        BookEntity bookEntity = bookRepository
                .findById(id)
                .orElseThrow(() -> new TitleNotFoundException("Book not found: id = " + id));

        return mapper.bookEntityToTitle(bookEntity);
    }

    @Override
    public List<Title> findByName(String name) {
        Iterable<BookEntity> iterable = bookRepository.findAllByNameTitleContaining(name);
        return StreamSupport.stream(iterable.spliterator(), false)
                .map(mapper::bookEntityToTitle)
                .collect(Collectors.toList());
    }

    @Override
    public List<Title> getAllTitles() {
        Iterable<BookEntity> iterable = bookRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .map(mapper::bookEntityToTitle)
                .collect(Collectors.toList());
    }

    @Override
    public void addTitle(Title title) {
        BookEntity bookEntity = mapper.bookToTitleEntity(title);
        bookRepository.save(bookEntity);
    }
}
