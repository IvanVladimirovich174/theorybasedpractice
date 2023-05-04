package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.BookWithAuthorsDto;
import com.mapstruct.mapstruct.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookWithAuthorsMapper {
    BookWithAuthorsDto toDto(Book book);

    Book toEntity(BookWithAuthorsDto bookWithAuthorsDto);
}