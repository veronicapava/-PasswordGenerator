package com.sofka.generator.password;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PasswordRepository extends ReactiveCrudRepository<PasswordLength, String> {
}
