package com.mapstruct.mapstruct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDto {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("authorFIO")
    private String authorFIO;

    @JsonProperty("birthDate")
    private Date birthDate;
}