package com.example.firstspringjdbc.dao;

import com.example.firstspringjdbc.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {
    Book findById(Long id);
    List<Book> findAll() throws SQLException;
}