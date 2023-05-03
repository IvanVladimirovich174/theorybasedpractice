package com.mapstruct.mapstruct.controller;

import com.mapstruct.mapstruct.model.Author;
import com.mapstruct.mapstruct.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public Author create(@RequestBody Author author) {
        return authorService.createAuthor(author);
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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Author>> list() {
        return ResponseEntity.status(HttpStatus.OK).body(authorService.getAllAuthors());
    }
}