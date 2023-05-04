package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.AuthorWithBooksDto;
import com.mapstruct.mapstruct.model.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorWithBooksMapper {
    AuthorWithBooksDto toDto(Author author);

    Author toEntity(AuthorWithBooksDto authorDto);
}