package com.authenticationandauthorization.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserCache {
    private Map<String, UserInfo> cache = new HashMap<>();

    public UserInfo get(String login) {
        return cache.get(login);
    }

    @PostConstruct
    public void init() {
        create(new UserInfo("Ivan777","qwerty","Ivan","ADMIN"));
        create(new UserInfo("Vasya01","abcd","Vasya","ADMIN"));
        create(new UserInfo("Denis333","qwerty","Denis","MANAGER"));
    }

    private void create(UserInfo userInfo) {
        cache.put(userInfo.getLogin(),userInfo);
    }
}