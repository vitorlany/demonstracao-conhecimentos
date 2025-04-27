package com.example.demo.core.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testIfNameUnder5CharactersIsNotValid() {
        assertThrows(IllegalArgumentException.class,
                () -> new Person("", ""));
    }

    @Test
    void testIfNameWith5OrMoreCharactersIsValid() {
        assertDoesNotThrow(() -> new Person("12345", ""));
    }
}