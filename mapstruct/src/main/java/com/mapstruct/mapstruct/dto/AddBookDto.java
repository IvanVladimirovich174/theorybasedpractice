package com.mapstruct.mapstruct.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookDto {
    private Long authorId;
    private Long bookId;
}