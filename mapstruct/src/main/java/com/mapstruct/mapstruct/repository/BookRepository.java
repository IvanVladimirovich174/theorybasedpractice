package com.mapstruct.mapstruct.repository;

import com.mapstruct.mapstruct.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}