package com.sofka.generator.password.services;

import com.sofka.generator.password.PasswordApplication;
import com.sofka.generator.password.model.Password;
import com.sofka.generator.password.model.PassGenerator;
import com.sofka.generator.password.repository.PasswordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PasswordService implements PasswordServiceInt{

    @Autowired
    PasswordRepository passwordRepository;

    private static final Logger log = LoggerFactory.getLogger(PasswordApplication.class);

    @Override
    public Mono<Password> save(Password password) {
        return this.passwordRepository.save(password);
    }


    public Mono<Password> generatePass(int size) {
        Password pass = new Password();
        PassGenerator passGenerator = new PassGenerator();

        return Mono.just(passGenerator)
                .map(entity -> {
                    var list = Stream.of(entity.getAllCharacters().split(""))
                            .collect(Collectors.toList());
                    Collections.shuffle(list);
                    var randomPass = list.subList(0,size);
                    pass.setPassword(String.valueOf(randomPass));
                    return pass;
                });
    }


}
