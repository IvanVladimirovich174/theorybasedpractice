package com.mapstruct.mapstruct.controller;

import com.mapstruct.mapstruct.model.User;
import com.mapstruct.mapstruct.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getOneUser(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}