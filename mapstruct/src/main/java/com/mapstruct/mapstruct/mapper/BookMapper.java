package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.BookDto;
import com.mapstruct.mapstruct.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toDto(Book book);

    Book toEntity(BookDto bookDto);
}