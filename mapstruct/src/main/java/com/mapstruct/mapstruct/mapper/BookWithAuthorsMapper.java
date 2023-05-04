package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.BookWithAuthorsDto;
import com.mapstruct.mapstruct.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookWithAuthorsMapper {
    BookWithAuthorsMapper INSTANCE = Mappers.getMapper(BookWithAuthorsMapper.class);

    BookWithAuthorsDto toDto(Book book);

    Book toEntity(BookWithAuthorsDto bookWithAuthorsDto);
}