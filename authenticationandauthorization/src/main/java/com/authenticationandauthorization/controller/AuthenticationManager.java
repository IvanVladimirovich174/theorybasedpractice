package com.authenticationandauthorization.controller;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationManager {
    public boolean authorize(String login, String password) {
        return "admin".equalsIgnoreCase(login) && "qwerty".equalsIgnoreCase(password);
    }
}