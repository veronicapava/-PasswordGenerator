package com.sofka.generator.password.model;


public class PassGenerator {

    private String smallLetters= "qwertyuiopasdfghjklzxcvbnm";

    private String upperLetters= "QWERTYUIOPASDFGHJKLZXCVBNM";

    private String numbers = "0123456789";

    private String allCharacters = smallLetters.concat(numbers).concat(upperLetters);

    public PassGenerator() {
        this.allCharacters = allCharacters;
    }

    public String getSmallLetters() {
        return smallLetters;
    }

    public void setSmallLetters(String smallLetters) {
        this.smallLetters = smallLetters;
    }

    public String getUpperLetters() {
        return upperLetters;
    }

    public void setUpperLetters(String upperLetters) {
        this.upperLetters = upperLetters;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getAllCharacters() {
        return allCharacters;
    }

    public void setAllCharacters(String allCharacters) {
        this.allCharacters = allCharacters;
    }
}
