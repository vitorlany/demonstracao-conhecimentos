package com.example.demo.infrastructure.data.dataprovider;

import com.example.demo.core.domain.Person;

import java.util.List;

public interface IPersonDataProvider {
    Long registerPerson(Person person);
    List<Person> getAllPersons();
}
