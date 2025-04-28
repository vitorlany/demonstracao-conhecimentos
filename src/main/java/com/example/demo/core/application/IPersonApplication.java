package com.example.demo.core.application;

import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.dto.RegisterPersonDTO;

import java.util.List;

public interface IPersonApplication {
    Long registerPerson(RegisterPersonDTO registerPersonDTO);
    List<Person> getAllPerson();
}
