package com.mapstruct.mapstruct.service;

import com.mapstruct.mapstruct.model.Book;
import com.mapstruct.mapstruct.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Book> getAllUsers() {
        return userRepository.findAll();
    }

    public Book getOneUser(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public Book createUser(Book user) {
        return userRepository.save(user);
    }

    public Book updateUser(Book user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}