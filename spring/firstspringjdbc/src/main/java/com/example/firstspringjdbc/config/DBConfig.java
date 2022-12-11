package com.example.firstspringjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.example.firstspringjdbc.DBConstants.*;

@Configuration
public class DBConfig {
    @Bean
    @Scope("singleton")
    public Connection connection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://" + DB_HOST + ":" + PORT + "/" + DB_NAME,
                USER,
                PASSWORD);
    }
}