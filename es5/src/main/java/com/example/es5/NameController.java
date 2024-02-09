package com.example.es5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:63342"}) //protezione per intera classe
public class NameController {
    @GetMapping("/hello")
    public String hello () {
        return "hello";
    }

    @GetMapping("/nome")
    public String getNome (@RequestParam String nome) {
        return nome;
    }

    @PostMapping("/nome")
    public String getNomeContrario (@RequestParam String nome) {
        StringBuilder stringBuilder = new StringBuilder(nome);
        return stringBuilder.reverse().toString();
    }
}

