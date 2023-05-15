package com.mapstruct.mapstruct.service;

import com.mapstruct.mapstruct.dto.AddBookDto;
import com.mapstruct.mapstruct.model.Author;
import com.mapstruct.mapstruct.model.Book;
import com.mapstruct.mapstruct.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final BookService bookService;

    public AuthorService(AuthorRepository authorRepository, BookService bookService) {
        this.authorRepository = authorRepository;
        this.bookService = bookService;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getOneAuthor(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

    public Author addBook(AddBookDto addBookDto) {
        Author author = getOneAuthor(addBookDto.getAuthorId());
        Book book = bookService.getOneBook(addBookDto.getBookId());
        author.getBooks().add(book);
        return updateAuthor(author);
    }
}