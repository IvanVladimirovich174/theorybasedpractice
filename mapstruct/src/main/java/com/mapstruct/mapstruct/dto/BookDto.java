package com.mapstruct.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("title")
    private String title;
}