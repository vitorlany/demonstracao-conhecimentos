package com.example.demo.infrastructure.data.dataprovider;

import com.example.demo.core.domain.Person;
import com.example.demo.infrastructure.data.entity.PersonEntity;
import com.example.demo.infrastructure.data.repository.PersonEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonDataProvider {
    private final PersonEntityRepository personEntityRepository;

    public Long registerPerson(Person person) {
        final var entity = new PersonEntity(person.getName(), person.getCpf());
        final var persistedEntity = personEntityRepository.save(entity);
        return persistedEntity.getId();
    }

    public List<Person> getAllPersons() {
        return personEntityRepository.findAll()
                .stream().map(obj -> new Person(obj.getId(), obj.getName(), obj.getCpf())).toList();
    }
}
