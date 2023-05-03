package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.AuthorWithBooksDto;
import com.mapstruct.mapstruct.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorWithBooksMapper {
    AuthorWithBooksMapper INSTANCE = Mappers.getMapper(AuthorWithBooksMapper.class);

    AuthorWithBooksDto toDto(Author author);

    Author toEntity(AuthorWithBooksDto authorDto);
}