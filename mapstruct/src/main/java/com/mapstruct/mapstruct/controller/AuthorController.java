package com.mapstruct.mapstruct.controller;

import com.mapstruct.mapstruct.dto.AuthorDto;
import com.mapstruct.mapstruct.mapper.AuthorMapper;
import com.mapstruct.mapstruct.model.Author;
import com.mapstruct.mapstruct.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;
    private final AuthorMapper authorMapper;

    public AuthorController(AuthorService authorService, AuthorMapper authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody AuthorDto authorDto) {
        return ResponseEntity.status(HttpStatus.OK).
                body(authorService.createAuthor(authorMapper.toEntity(authorDto)));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> list() {
        return ResponseEntity.status(HttpStatus.OK).
                body(authorMapper.getAllDto(authorService.getAllAuthors()));
    }

    @GetMapping(value = "/{id}")
    public Author getById(@PathVariable Long id) {
        return authorService.getOneAuthor(id);
    }

    @PutMapping
    public Author update(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }
}