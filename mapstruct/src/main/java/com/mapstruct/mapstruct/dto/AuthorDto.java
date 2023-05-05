package com.mapstruct.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Builder
public class AuthorDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("authorFIO")
    private String authorFIO;
}