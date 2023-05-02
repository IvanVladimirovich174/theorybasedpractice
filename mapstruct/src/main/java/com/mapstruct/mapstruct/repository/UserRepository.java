package com.mapstruct.mapstruct.repository;

import com.mapstruct.mapstruct.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Book, Long> {
}