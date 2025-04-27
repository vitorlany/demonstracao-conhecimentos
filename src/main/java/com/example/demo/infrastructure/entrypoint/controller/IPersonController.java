package com.example.demo.infrastructure.entrypoint.controller;

import com.example.demo.core.domain.Person;
import com.example.demo.infrastructure.entrypoint.controller.request.RegisterPersonRequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public interface IPersonController {

    @PostMapping
    Long registerPerson(@RequestBody RegisterPersonRequestBody registerPersonRequestBody) ;

    @GetMapping
    List<Person> getAllPersons();
}
