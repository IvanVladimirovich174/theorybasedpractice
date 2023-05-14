package com.mapstruct.mapstruct.controller;

import com.mapstruct.mapstruct.dto.AuthorDto;
import com.mapstruct.mapstruct.mapper.AuthorMapper;
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
                body(authorService.createAuthor(authorMapper.toAuthorEntity(authorDto)));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> list() {
        return ResponseEntity.status(HttpStatus.OK).
                body(authorService.getAllAuthors());
    }

    @DeleteMapping
    public void delete(@RequestBody AuthorDto authorDto) {
        authorService.deleteAuthor(authorDto.getId());
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody AuthorDto authorDto) {
        return ResponseEntity.status(HttpStatus.OK).
                body(authorService.updateAuthor(authorMapper.toAuthorEntity(authorDto)));
    }
}