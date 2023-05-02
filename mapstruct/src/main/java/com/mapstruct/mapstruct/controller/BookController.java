package com.mapstruct.mapstruct.controller;

import com.mapstruct.mapstruct.model.Book;
import com.mapstruct.mapstruct.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService userService;

    public BookController(BookService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Book> list() {
        return userService.getAllBooks();
    }

    @GetMapping(value = "/{id}")
    public Book getById(@PathVariable Long id) {
        return userService.getOneBook(id);
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return userService.createBook(book);
    }

    @PutMapping
    public Book update(@RequestBody Book book) {
        return userService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteBook(id);
    }
}