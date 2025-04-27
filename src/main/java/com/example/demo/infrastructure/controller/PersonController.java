package com.example.demo.infrastructure.controller;

import com.example.demo.core.domain.Person;
import com.example.demo.core.usecase.IGetAllPersonUseCase;
import com.example.demo.core.usecase.IRegisterPersonUseCase;
import com.example.demo.infrastructure.controller.request.RegisterPersonRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final IRegisterPersonUseCase registerPersonUseCase;
    private final IGetAllPersonUseCase getAllPersonUseCase;

    @PostMapping
    public Long registerPerson(@RequestBody RegisterPersonRequest registerPersonRequest) {
        return registerPersonUseCase.execute(registerPersonRequest.name(), registerPersonRequest.cpf());
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return getAllPersonUseCase.execute();
    }
}
