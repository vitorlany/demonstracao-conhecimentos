package com.example.demo.infrastructure.entrypoint.controller.impl;

import com.example.demo.core.application.IPersonApplication;
import com.example.demo.core.domain.Person;
import com.example.demo.infrastructure.entrypoint.controller.IPersonController;
import com.example.demo.infrastructure.entrypoint.controller.request.RegisterPersonRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonControllerImpl implements IPersonController {
    private final IPersonApplication personApplication;

    @Override
    public Long registerPerson(final RegisterPersonRequestBody registerPersonRequestBody) {
        return personApplication.registerPerson(
                registerPersonRequestBody.name(),
                registerPersonRequestBody.cpf()
        );
    }

    @Override
    public List<Person> getAllPersons() {
        return personApplication.getAllPerson();
    }
}
