package com.sofka.generator.password.controller;

import com.sofka.generator.password.model.Password;
import com.sofka.generator.password.model.SizeDTO;
import com.sofka.generator.password.services.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(value= "/")
public class PasswordController {

    @Autowired
    PasswordService passwordService;

    @GetMapping(value = "/get")
    public ResponseEntity<String> getAll() {
        return new ResponseEntity<>("Aca se mostraran las contraseñas", HttpStatus.OK);
    }

    @PostMapping(value= "/post")
    public ResponseEntity<Mono<Password>> generatePass(@RequestBody SizeDTO size){
       return new ResponseEntity<>(passwordService.generatePass(size.getSize()), HttpStatus.CREATED);
    }
}




