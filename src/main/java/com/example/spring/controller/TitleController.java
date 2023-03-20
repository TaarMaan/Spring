package com.example.spring.controller;

import com.example.spring.model.Title;
import com.example.spring.model.BookRequest;
import com.example.spring.mapper.BookToDtoMapper;
import com.example.spring.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/titles")
@RequiredArgsConstructor
public class TitleController {

    private final BookService bookService;
    private final BookToDtoMapper mapper;

    @GetMapping("/{id}")
    public Title getTitleById(@PathVariable Long id) {
        return bookService.getTitleById(id);
    }

    @GetMapping("/{name}")
    public List<Title> findByName(@PathVariable String name) {
        return bookService.findByName(name);
    }

    @GetMapping("/{category}")
    public List<Title> findByCategory(@PathVariable String category) {
        return bookService.findByCategory(category);
    }

    @GetMapping("/{rating}")
    public List<Title> findByRating(@PathVariable Double rating) {
        return bookService.findByRating(rating);
    }

    @GetMapping
    public List<Title> getAllTitles() {
        return bookService.getAllTitles();
    }

    @GetMapping
    @PostMapping("/new")
    public void addTitle(@RequestBody BookRequest request) {
        bookService.addTitle(mapper.AddBookRequestToTitle(request));
    }
    //
    @GetMapping()
    public String index(Model model) {
        model.addAttribute("title", bookService.getAllTitles());
        return "titles/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("title", bookService.show(id));
        return "people/show";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("title") @Valid Title title,
                         BindingResult bindingResult, @PathVariable("id") Long id) {
        if (bindingResult.hasErrors())
            return "titles/edit";
        bookService.update(id, title);
        return "redirect:/titles";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id) {
        bookService.delete(id);
        return "redirect:/titles";
    }

    @GetMapping("/new")
    public String newTitle(@ModelAttribute("title") Title title) {
        return "people/new";
    }

    //байндинг резалт должен быть всегда после сразу объекта, на котором могут быть
    // ошибки, чтобы записать в переменную байдингрезалт эти ошибки
    @PostMapping()
    public String create(@ModelAttribute("title") @Valid Title title,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "titles/new";

        bookService.save(title);
        return "redirect:/titles";
    }
    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        //model.addAttribute("title", bookService.show(id));
        return "titles/edit";
    }
}
