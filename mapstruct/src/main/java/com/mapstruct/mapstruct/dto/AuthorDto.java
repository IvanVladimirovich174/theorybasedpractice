package com.mapstruct.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class AuthorDto {
    @JsonProperty("authorFIO")
    private String authorFIO;

    @JsonProperty("birthDate")
    private Date birthDate;
}