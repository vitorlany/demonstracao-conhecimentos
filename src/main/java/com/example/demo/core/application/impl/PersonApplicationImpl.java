package com.example.demo.core.application.impl;

import com.example.demo.core.application.IPersonApplication;
import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.IGetAllPersonUseCase;
import com.example.demo.core.usecase.IRegisterPersonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonApplicationImpl implements IPersonApplication {
    private final IRegisterPersonUseCase registerPersonUseCase;
    private final IGetAllPersonUseCase getAllPersonUseCase;

    @Override
    public Long registerPerson(final String name, final String cpf) {
        return registerPersonUseCase.execute(name, cpf);
    }

    @Override
    public List<Person> getAllPerson() {
        return getAllPersonUseCase.execute();
    }
}
