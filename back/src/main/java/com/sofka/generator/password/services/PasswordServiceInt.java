package com.sofka.generator.password.services;

import com.sofka.generator.password.model.Password;
import reactor.core.publisher.Mono;

public interface PasswordServiceInt {

    Mono<Password> save(Password password);
}
