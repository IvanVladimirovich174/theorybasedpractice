package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.BookDto;
import com.mapstruct.mapstruct.model.Book;
import org.mapstruct.InheritConfiguration;

public interface BookMapper {
    BookDto toDto(Book book);

    @InheritConfiguration
    Book toEntity(BookDto bookDto);
}