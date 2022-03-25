package com.sofka.generator.password;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PasswordLength {

    private String passwordLength;

    private String randomPassword;

    public String getPasswordLength() {
        return passwordLength;
    }

    public void setPasswordLength(String passwordLength) {
        this.passwordLength = passwordLength;
    }

    public String getRandomPassword() {
        return randomPassword;
    }

    public void setRandomPassword(String randomPassword) {
        this.randomPassword = randomPassword;
    }
}
