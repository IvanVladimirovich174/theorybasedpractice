package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.BookDto;
import com.mapstruct.mapstruct.dto.BookWithAuthorsDto;
import com.mapstruct.mapstruct.model.Book;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper/*(componentModel = "spring", uses = AuthorMapper.class)*/
public interface BookMapper {
    BookDto toBookDto(Book book);

    Book toBookEntity(BookDto bookDto);

    @InheritConfiguration
    BookWithAuthorsDto toBookWithAuthorsDto(Book book);

    List<BookDto> toListDto(List<Book> book);
}