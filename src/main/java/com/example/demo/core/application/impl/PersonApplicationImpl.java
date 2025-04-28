package com.example.demo.core.application.impl;

import com.example.demo.core.application.IPersonApplication;
import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.IGetAllPersonUseCase;
import com.example.demo.core.usecase.IRegisterPersonUseCase;
import com.example.demo.core.usecase.dto.RegisterPersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonApplicationImpl implements IPersonApplication {
    private final IRegisterPersonUseCase registerPersonUseCase;
    private final IGetAllPersonUseCase getAllPersonUseCase;

    @Override
    public Long registerPerson(final RegisterPersonDTO registerPersonDTO) {
        return registerPersonUseCase.execute(registerPersonDTO);
    }

    @Override
    public List<Person> getAllPerson() {
        return getAllPersonUseCase.execute();
    }
}
