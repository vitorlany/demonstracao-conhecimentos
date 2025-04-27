package com.example.demo.core.usecase.impl;

import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.IGetAllPersonUseCase;
import com.example.demo.infrastructure.data.dataprovider.IPersonDataProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GetAllPersonUseCaseImpl implements IGetAllPersonUseCase {
    private final IPersonDataProvider personDataProvider;

    @Override
    public List<Person> execute() {
        final var allPersons = personDataProvider.getAllPersons();
        log.info("Retornando {} Persons cadastrados", allPersons.size());
        return allPersons;
    }
}
