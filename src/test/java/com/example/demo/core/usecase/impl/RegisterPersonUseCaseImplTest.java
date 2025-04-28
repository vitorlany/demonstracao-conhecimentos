package com.example.demo.core.usecase.impl;

import com.example.demo.core.usecase.dto.RegisterPersonDTO;
import com.example.demo.infrastructure.data.dataprovider.IPersonDataProvider;
import com.example.demo.infrastructure.mapper.PersonMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RegisterPersonUseCaseImplTest {

    @Mock
    private IPersonDataProvider personDataProvider;

    @Mock
    private PersonMapper personMapper;

    @InjectMocks
    private RegisterPersonUseCaseImpl registerPersonUseCase;

    @Test
    void testIfNameUnder5CharactersIsNotValid() {
        final var registerPersonDTO = new RegisterPersonDTO("", "");
        assertThrows(IllegalArgumentException.class,
                () -> registerPersonUseCase.execute(registerPersonDTO));
    }
    
    @Test
    void testIfNameWith5OrMoreCharactersIsValid() {
        final var registerPersonDTO = new RegisterPersonDTO("12345", "");
        assertDoesNotThrow(() ->
                registerPersonUseCase.execute(registerPersonDTO));
    }
}