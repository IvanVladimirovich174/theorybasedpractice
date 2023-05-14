package com.mapstruct.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class AuthorDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("authorFIO")
    private String authorFIO;

    @JsonProperty("birthDate")
    private Date birthDate;
}