package com.example.demo.core.domain;

import lombok.Data;

@Data
public class Person {
    private final Long id;
    private final String name;
    private final String cpf;

    public Person(final Long id, final String name, final String cpf) {
        if (name.length() < 5) {
            throw new IllegalArgumentException("Nome deveria ter 5 ou mais caracteres");
        }
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    public Person(final String name, final String cpf) {
        this(null, name, cpf);
    }
}
