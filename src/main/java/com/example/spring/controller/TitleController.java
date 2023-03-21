package com.example.spring.controller;

import com.example.spring.model.Title;
import com.example.spring.model.BookRequest;
import com.example.spring.mapper.BookToDtoMapper;
import com.example.spring.service.BookService;
//import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/titles")
@RequiredArgsConstructor
public class TitleController {

    private final BookService bookService;
    private final BookToDtoMapper mapper;

    @GetMapping("/{id}")
    public Title getTitleById(@PathVariable Long id) {
        return bookService.getTitleById(id);
    }

    @GetMapping
    public List<Title> getAllTitles(@RequestParam(required = false)
                                    String category,String name,String rating) {
        if (category != null)
            return bookService.findByCategory(category);
        else if(name != null)
            return bookService.findByName(name);
        else if(rating != null)
            return bookService.findByRating(rating);
        return bookService.getAllTitles();
    }

    /*@GetMapping("/category")
    public List<Title> getAllTitlesByCategory(@PathVariable String category) {
        return bookService.findByCategory(category);
    }

    @GetMapping("/{name}")
    public List<Title> getAllTitlesByName(@PathVariable String name) {
        return bookService.findByName(name);
    }

    @GetMapping("/{rating}")
    public List<Title> getAllTitlesByRating(@PathVariable Double rating) {
        return bookService.findByRating(rating);
    }*/

    @PostMapping
    public void addTitle(@RequestBody BookRequest request) {
        bookService.addTitle(mapper.AddTitleRequestToBook(request));
    }

    @PutMapping("/{id}")
    public void editTitle(@PathVariable Long id, @RequestBody BookRequest request) {
        bookService.editTitle(mapper.EditTitleRequestToBook(id, request));
    }
//--------------------------------------------------------
//Потенциальные изменения к переходу отоброжений в html
    /*@GetMapping("/{id}")
    public String getTitleById(@PathVariable("id") Long id,Model model) {
        model.addAttribute("title", bookService.getTitleById(id));
        return "titles/show";
    }

    @GetMapping("/{nameTitle}")
    public String findByNameTitle(@PathVariable("nameTitle") String nameTitle,Model model) {
        model.addAttribute("title", bookService.findByNameTitle(nameTitle));
        return "titles/show";
    }

    @GetMapping("/{category}")
    public String findByCategory(@PathVariable("category") String category,Model model) {
        model.addAttribute("title", bookService.findByCategory(category));
        return "titles/show";
    }

    @GetMapping("/{rating}")
    public String findByRating(@PathVariable("rating") Double rating,Model model) {
        model.addAttribute("title", bookService.findByRating(rating));
        return "titles/show";
    }

    @GetMapping
    public String getAllTitles(Model model) {
        model.addAttribute("title", bookService.getAllTitles());
        return "titles/index";
    }

    @GetMapping
    @PostMapping("/new")
    public String newTitle(@ModelAttribute("title") Title title) {
        return "titles/new";
    }
    //

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
    }*/
}
