package com.sofka.generator.password.repository;

import com.sofka.generator.password.model.Password;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PasswordRepository extends ReactiveCrudRepository<Password, String> {
}
