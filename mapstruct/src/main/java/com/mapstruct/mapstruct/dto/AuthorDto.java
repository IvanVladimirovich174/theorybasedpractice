package com.mapstruct.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthorDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("authorFIO")
    private String authorFIO;

/*    @JsonProperty("booksId")
    private Set<Long> booksId;*/
}