package com.springsecurity.controller;

public class AuthResult {
    private String status;

    public AuthResult(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "AuthResult{" +
                "status='" + status + '\'' +
                '}';
    }
}