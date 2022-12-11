package com.example.firstspringjdbc;

import com.example.firstspringjdbc.dao.BookDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjdbcApplication implements CommandLineRunner {
    private final BookDao bookDao;

    public SpringjdbcApplication(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringjdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(bookDao.findAll());
    }
}