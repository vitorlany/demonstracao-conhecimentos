package com.example.demo.infrastructure.mapper;

import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.dto.RegisterPersonDTO;
import com.example.demo.infrastructure.data.entity.PersonEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    Person map(RegisterPersonDTO registerPersonDTO);
    PersonEntity map(Person person);
    List<Person> map(List<PersonEntity> personEntities);
}
