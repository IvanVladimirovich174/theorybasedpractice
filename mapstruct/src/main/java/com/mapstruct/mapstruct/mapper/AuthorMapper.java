package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.AuthorDto;
import com.mapstruct.mapstruct.dto.AuthorWithBooksDto;
import com.mapstruct.mapstruct.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = BookMapper.class)
public interface AuthorMapper {
    AuthorDto toAuthorDto(Author author);

    Author toAuthorEntity(AuthorDto authorDto);

    @Mapping(source = "books", target = "books")
    AuthorWithBooksDto toAuthorsWithBooksDto(Author author);

    List<AuthorDto> toListBookDto(List<Author> author);
}