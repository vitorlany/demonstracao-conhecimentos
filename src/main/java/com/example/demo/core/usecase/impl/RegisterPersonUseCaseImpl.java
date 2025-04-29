package com.example.demo.core.usecase.impl;

import com.example.demo.core.usecase.IRegisterPersonUseCase;
import com.example.demo.core.usecase.dto.RegisterPersonDTO;
import com.example.demo.infrastructure.data.dataprovider.IPersonDataProvider;
import com.example.demo.infrastructure.mapper.PersonMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RegisterPersonUseCaseImpl implements IRegisterPersonUseCase {
    private final IPersonDataProvider personDataProvider;
    private final PersonMapper personMapper;

    @Override
    public Long execute(final RegisterPersonDTO registerPersonDTO) {
        validate(registerPersonDTO);
        final var person = personMapper.map(registerPersonDTO);
        final var newPersonId = personDataProvider.registerPerson(person);
        log.info("Nova Person \"{}\" cadastrada: {}", registerPersonDTO.name(), newPersonId);
        return newPersonId;
    }

    private void validate(final RegisterPersonDTO registerPersonDTO) {
        if (registerPersonDTO.name().length() < 5) {
            throw new IllegalArgumentException("Nome deveria ter 5 ou mais caracteres");
        }
    }
}
