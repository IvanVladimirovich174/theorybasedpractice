package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.BookWithAuthorsDto;
import com.mapstruct.mapstruct.model.Book;
import org.mapstruct.factory.Mappers;

public interface BookWithAuthorsMapper {
    BookWithAuthorsMapper INSTANCE = Mappers.getMapper(BookWithAuthorsMapper.class);

    BookWithAuthorsDto toDto(Book book);

    Book toEntity(BookWithAuthorsDto bookWithAuthorsDto);
}