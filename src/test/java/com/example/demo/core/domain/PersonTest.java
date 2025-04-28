package com.example.demo.core.domain;

import com.example.demo.core.usecase.dto.RegisterPersonDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

//    TODO: recreate

    @Test
    void testIfNameUnder5CharactersIsNotValid() {
//        assertThrows(Exception.class,
//                () -> @Valid new RegisterPersonDTO(null, ""));
    }

    @Test
    void testIfNameWith5OrMoreCharactersIsValid() {
//        assertDoesNotThrow(() -> new Person("12345", ""));
    }
}