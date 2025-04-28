package com.example.demo.infrastructure.data.dataprovider.impl;

import com.example.demo.core.domain.Person;
import com.example.demo.infrastructure.data.dataprovider.IPersonDataProvider;
import com.example.demo.infrastructure.data.entity.PersonEntity;
import com.example.demo.infrastructure.data.repository.PersonEntityRepository;
import com.example.demo.infrastructure.mapper.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonRepository implements IPersonDataProvider {
    private final PersonEntityRepository personEntityRepository;
    private final PersonMapper personMapper;

    public Long registerPerson(final Person person) {
        final var entity = personMapper.map(person);
        final var persistedEntity = personEntityRepository.save(entity);
        return persistedEntity.getId();
    }

    public List<Person> getAllPersons() {
        final var entities = personEntityRepository.findAll();
        return personMapper.map(entities);
    }
}
