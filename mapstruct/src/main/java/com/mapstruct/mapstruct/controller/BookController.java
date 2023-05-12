package com.mapstruct.mapstruct.controller;

import com.mapstruct.mapstruct.dto.BookDto;
import com.mapstruct.mapstruct.mapper.BookMapper;
import com.mapstruct.mapstruct.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    private final BookMapper bookMapper;

    public BookController(BookService bookService, BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody BookDto bookDto) {
        return ResponseEntity.status(HttpStatus.OK).
                body(bookService.createBook(bookMapper.toEntity(bookDto)));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> list() {
        return ResponseEntity.status(HttpStatus.OK).
                body(bookService.getAllBooks());
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestBody BookDto bookDto) {
        bookService.deleteBook(bookDto.getId());
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody BookDto bookDto) {
        return ResponseEntity.status(HttpStatus.OK).
                body(bookService.updateBook(bookMapper.toEntity(bookDto)));
    }
}