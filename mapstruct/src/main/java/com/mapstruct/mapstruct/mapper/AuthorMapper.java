package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.AuthorDto;
import com.mapstruct.mapstruct.model.Author;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDto toDto(Author author);

    @InheritConfiguration
    Author toEntity(AuthorDto authorDto);
}