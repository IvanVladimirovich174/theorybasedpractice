package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.AuthorDto;
import com.mapstruct.mapstruct.dto.AuthorWithBooksDto;
import com.mapstruct.mapstruct.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = {BookMapper.class})
public interface AuthorMapper {
    @Named(value = "toAuthorDto")
    AuthorDto toAuthorDto(Author author);

    Author toAuthorEntity(AuthorDto authorDto);

    @Mapping(source = "books", target = "booksDto", qualifiedByName = "toBookDto")
    AuthorWithBooksDto toAuthorWithBooksDto(Author author);

    List<AuthorDto> toListAuthorDto(List<Author> authorList);

    List<AuthorWithBooksDto> toListAuthorWithBooksDto(List<Author> authorList);
}