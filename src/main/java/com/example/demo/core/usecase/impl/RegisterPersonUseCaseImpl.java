package com.example.demo.core.usecase.impl;

import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.IRegisterPersonUseCase;
import com.example.demo.infrastructure.data.dataprovider.IPersonDataProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegisterPersonUseCaseImpl implements IRegisterPersonUseCase {
    private final IPersonDataProvider personDataProvider;

    @Override
    public Long execute(final String name, final String cpf) {
        final var person = new Person(name, cpf);
        final var newPersonId = personDataProvider.registerPerson(person);
        log.info("Nova Person \"{}\" cadastrada: {}", name, newPersonId);
        return newPersonId;
    }
}
