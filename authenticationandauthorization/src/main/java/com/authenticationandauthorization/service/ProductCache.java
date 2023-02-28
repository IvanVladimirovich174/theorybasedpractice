package com.authenticationandauthorization.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCache {
    private Map<String,Product> cache = new HashMap<>();

    public List<Product> getAll() {
        return new ArrayList<>(cache.values());
    }

    public Product get(String id) {
        return cache.get(id);
    }

    public Product create(Product info) {
        cache.put(info.getId(), info);
        return info;
    }

    public Product update(Product info) {
        cache.put(info.getId(), info);
        return info;
    }
}