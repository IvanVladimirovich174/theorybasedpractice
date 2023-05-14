package com.mapstruct.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class BookWithAuthorsDto extends BookDto {
    @JsonProperty("authorsDto")
    Set<AuthorDto> authorsDto;
}