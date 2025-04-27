package com.example.demo.core.usecase;

import com.example.demo.core.domain.Person;

import java.util.List;

public interface IGetAllPersonUseCase {
    List<Person> execute();
}
