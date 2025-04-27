package com.example.demo.infrastructure.controller;

import com.example.demo.core.application.IPersonApplication;
import com.example.demo.core.domain.Person;
import com.example.demo.infrastructure.controller.request.RegisterPersonRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final IPersonApplication personApplication;

    @PostMapping
    public Long registerPerson(@RequestBody RegisterPersonRequestBody registerPersonRequestBody) {
        return personApplication.registerPerson(
                registerPersonRequestBody.name(),
                registerPersonRequestBody.cpf()
        );
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personApplication.getAllPerson();
    }
}
