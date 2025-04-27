package com.example.demo.core.application.impl;

import com.example.demo.core.application.ITextApplication;
import com.example.demo.core.usecase.IGenerateRandomTextUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ITextApplicationImpl implements ITextApplication {
    private final IGenerateRandomTextUseCase generateRandomTextUseCase;

    @Override
    public String generateRandomText() {
        return generateRandomTextUseCase.execute();
    }
}
