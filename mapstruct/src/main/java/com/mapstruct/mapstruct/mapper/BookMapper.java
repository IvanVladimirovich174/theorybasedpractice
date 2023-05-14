package com.mapstruct.mapstruct.mapper;

import com.mapstruct.mapstruct.dto.BookDto;
import com.mapstruct.mapstruct.dto.BookWithAuthorsDto;
import com.mapstruct.mapstruct.model.Book;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = AuthorMapper.class)
public interface BookMapper {
    @Named(value = "toBookDto")
    BookDto toBookDto(Book book);

    Book toBookEntity(BookDto bookDto);


    @Mapping(source = "authors", target = "authorsDto", qualifiedByName = "toAuthorDto")
    @InheritInverseConfiguration
    BookWithAuthorsDto toBookWithAuthorsDto(Book book);

    List<BookDto> toListDto(List<Book> book);
}