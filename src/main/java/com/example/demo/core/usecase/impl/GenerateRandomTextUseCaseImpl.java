package com.example.demo.core.usecase.impl;

import com.example.demo.core.usecase.IGenerateRandomTextUseCase;
import com.example.demo.infrastructure.data.dataprovider.TextEntityDataProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class GenerateRandomTextUseCaseImpl implements IGenerateRandomTextUseCase {

    private final TextEntityDataProvider textEntityDataProvider;

    @Override
    public String execute() {
        try {
            return textEntityDataProvider.getAllTexts().getLast();
        } catch (Exception e) {
            return "Ainda está vazio!";
        } finally {
            textEntityDataProvider.addText(LocalDateTime.now().toString());
        }
    }
}
