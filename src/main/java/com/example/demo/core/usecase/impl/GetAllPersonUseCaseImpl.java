package com.example.demo.core.usecase.impl;

import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.IGetAllPersonUseCase;
import com.example.demo.infrastructure.data.dataprovider.IPersonDataProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllPersonUseCaseImpl implements IGetAllPersonUseCase {
    private final IPersonDataProvider personDataProvider;

    @Override
    public List<Person> execute() {
        return personDataProvider.getAllPersons();
    }
}
