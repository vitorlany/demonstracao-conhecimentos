package com.example.demo.infrastructure.data.dataprovider;

import com.example.demo.core.domain.Person;
import com.example.demo.infrastructure.data.entity.PersonEntity;
import com.example.demo.infrastructure.data.repository.PersonEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPersonDataProvider {
    Long registerPerson(Person person);
    List<Person> getAllPersons();
}
