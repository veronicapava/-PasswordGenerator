package com.sofka.generator.password;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordApplication{


    public static void main(String[] args) {
        SpringApplication.run(PasswordApplication.class, args);
    }

/*

    @Override
    public void run(String... args) throws Exception {
        var a = generatePass();
        a.subscribe(p -> log.info(p.toString()));
    }*/
}
