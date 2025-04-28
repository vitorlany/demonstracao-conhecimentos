package com.example.demo.core.usecase;

import com.example.demo.core.usecase.dto.RegisterPersonDTO;

public interface IRegisterPersonUseCase {
    Long execute(RegisterPersonDTO registerPersonDTO);
}
