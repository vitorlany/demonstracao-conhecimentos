package com.example.demo.core.application;

import com.example.demo.core.domain.Person;

import java.util.List;

public interface IPersonApplication {
    Long registerPersonUseCase(String name, String cpf);
    List<Person> getAllPersonUseCase();
}
