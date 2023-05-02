package com.mapstruct.mapstruct.repository;

import com.mapstruct.mapstruct.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}