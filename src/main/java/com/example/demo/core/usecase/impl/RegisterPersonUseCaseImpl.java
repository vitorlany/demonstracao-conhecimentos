package com.example.demo.core.usecase.impl;

import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.IRegisterPersonUseCase;
import com.example.demo.infrastructure.data.dataprovider.PersonDataProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterPersonUseCaseImpl implements IRegisterPersonUseCase {
    private final PersonDataProvider personDataProvider;

    @Override
    public Long execute(final String name, final String cpf) {
        final var person = new Person(name, cpf);
        return personDataProvider.registerPerson(person);
    }
}
