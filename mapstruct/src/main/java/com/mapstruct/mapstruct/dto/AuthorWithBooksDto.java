package com.mapstruct.mapstruct.dto;

import java.util.Set;

public class AuthorWithBooksDto extends AuthorDto {
    private Set<BookDto> books;
}