package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.BookDto;
import com.mapstruct.mapstruct.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto toDto(Book book);

    Book toEntity(BookDto bookDto);
}