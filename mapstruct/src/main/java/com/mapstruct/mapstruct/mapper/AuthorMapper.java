package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.AuthorDto;
import com.mapstruct.mapstruct.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorDto toDto(Author author);
}