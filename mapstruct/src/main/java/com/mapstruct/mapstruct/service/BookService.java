package com.mapstruct.mapstruct.service;

import com.mapstruct.mapstruct.model.Book;
import com.mapstruct.mapstruct.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository userRepository;

    public BookService(BookRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Book> getAllBooks() {
        return userRepository.findAll();
    }

    public Book getOneBook(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public Book createBook(Book user) {
        return userRepository.save(user);
    }

    public Book updateBook(Book user) {
        return userRepository.save(user);
    }

    public void deleteBook(Long id) {
        userRepository.deleteById(id);
    }
}