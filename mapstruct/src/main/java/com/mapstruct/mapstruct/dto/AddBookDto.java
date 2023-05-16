package com.mapstruct.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookDto {
    @JsonProperty("authorId")
    private Long authorId;

    @JsonProperty("bookId")
    private Long bookId;
}