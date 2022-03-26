package com.sofka.generator.password.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document ( collection = "password")
public class Password {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Password{" +
                "password='" + password + '\'' +
                '}';
    }
}
