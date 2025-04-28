package com.example.demo.infrastructure.entrypoint.controller.impl;

import com.example.demo.core.application.IPersonApplication;
import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.dto.RegisterPersonDTO;
import com.example.demo.infrastructure.entrypoint.controller.IPersonController;
import com.example.demo.infrastructure.entrypoint.controller.request.RegisterPersonRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonControllerImpl implements IPersonController {
    private final IPersonApplication personApplication;

    @Override
    public Long registerPerson(final RegisterPersonRequestBody registerPersonRequestBody) {
        final var registerPersonDTO = new RegisterPersonDTO(registerPersonRequestBody.name(), registerPersonRequestBody.cpf());
        return personApplication.registerPerson(registerPersonDTO);
    }

    @Override
    public List<Person> getAllPersons() {
        return personApplication.getAllPerson();
    }
}
