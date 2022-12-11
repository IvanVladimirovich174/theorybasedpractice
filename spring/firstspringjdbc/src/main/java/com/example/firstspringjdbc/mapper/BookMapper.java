package com.example.firstspringjdbc.mapper;

import com.example.firstspringjdbc.model.Book;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookMapper {
    public Book toBook(ResultSet resultSet) throws SQLException {
        Book book = new Book();

        book.setId(resultSet.getLong("id"));
        book.setTitle(resultSet.getString("title"));
        book.setAuthor(resultSet.getString("author"));
        book.setAddedDate(resultSet.getDate("date_added"));

        return book;
    }

    public List<Book> toBookList(ResultSet resultSet) throws SQLException {
        List<Book> listBook = new ArrayList<>();

        while (resultSet.next()) {
            listBook.add(toBook(resultSet));
        }

        return listBook;
    }
}