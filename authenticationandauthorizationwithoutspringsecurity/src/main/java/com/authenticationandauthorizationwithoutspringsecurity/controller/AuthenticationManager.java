package com.authenticationandauthorizationwithoutspringsecurity.controller;

import com.authenticationandauthorizationwithoutspringsecurity.service.UserCache;
import com.authenticationandauthorizationwithoutspringsecurity.service.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationManager {
    private UserCache userCache;

    @Autowired
    public void setUserCache(UserCache userCache) {
        this.userCache = userCache;
    }

    public AuthResult authorize(String login, String password) {
        UserInfo user = userCache.get(login);

        if (user == null) {
            return new AuthResult("User login= " + login + " not found. Please register");
        }

        if (!user.getPassword().equals(password)) {
            return new AuthResult("Incorrect credentials. Please, try again");
        }

        if ("ADMIN".equals(user.getRole())) {
            return new AuthResult("Access denied");
        }

        return new AuthResult("OK");
    }
}