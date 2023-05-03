package com.mapstruct.mapstruct.dto;

import java.util.Set;

public class AuthorDto {
    private Long id;
    private String authorFIO;
    private Set<Long> booksId;
}