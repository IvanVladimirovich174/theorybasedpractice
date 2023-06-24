package com.mapstruct.mapstruct.controller;

import com.mapstruct.mapstruct.dto.BookDto;
import com.mapstruct.mapstruct.mapper.BookMapper;
import com.mapstruct.mapstruct.service.BookService;
import lombok.NonNull;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    private final BookMapper bookMapper;

    public BookController(BookService bookService, @Lazy BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody BookDto bookDto) {
        return ResponseEntity.status(HttpStatus.OK).
                body(bookService.createBook(bookMapper.INSTANCE.toBookEntity(bookDto)));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> list() {
        return ResponseEntity.status(HttpStatus.OK).
                body(bookMapper.INSTANCE.toListBookWithAuthorsDto(bookService.getAllBooks()));
    }

    @DeleteMapping
    public void delete(@RequestBody
                       @NonNull BookDto bookDto) {
        bookService.deleteBook(bookDto.getId());
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody BookDto bookDto) {
        return ResponseEntity.status(HttpStatus.OK).
                body(bookService.updateBook(bookMapper.INSTANCE.toBookEntity(bookDto)));
    }
}