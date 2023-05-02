package com.mapstruct.mapstruct.controller;

import com.mapstruct.mapstruct.model.Book;
import com.mapstruct.mapstruct.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class BookController {
    private final UserService userService;

    public BookController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Book> list() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public Book getById(@PathVariable Long id) {
        return userService.getOneUser(id);
    }

    @PostMapping
    public Book create(@RequestBody Book user) {
        return userService.createUser(user);
    }

    @PutMapping
    public Book update(@RequestBody Book user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}