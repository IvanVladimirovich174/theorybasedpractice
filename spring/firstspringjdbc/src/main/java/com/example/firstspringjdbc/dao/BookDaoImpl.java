package com.example.firstspringjdbc.dao;

import com.example.firstspringjdbc.mapper.BookMapper;
import com.example.firstspringjdbc.model.Book;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    public final BookMapper bookMapper;
    private final Connection connection;

    public BookDaoImpl(BookMapper bookMapper, Connection connection) {
        this.bookMapper = bookMapper;
        this.connection = connection;
    }

    @Override
    public Book findById(Long id) {
        Book book = new Book();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from books where id = ?");

            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                book = bookMapper.toBook(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public List<Book> findAll() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from books");
        ResultSet resultSet = preparedStatement.executeQuery();

        return new ArrayList<>(bookMapper.toBookList(resultSet));
    }
}