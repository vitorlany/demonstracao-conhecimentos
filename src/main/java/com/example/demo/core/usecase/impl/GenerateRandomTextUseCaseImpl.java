package com.example.demo.core.usecase.impl;

import com.example.demo.core.usecase.IGenerateRandomTextUseCase;
import com.example.demo.infrastructure.data.dataprovider.ITextEntityDataProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class GenerateRandomTextUseCaseImpl implements IGenerateRandomTextUseCase {
    private final ITextEntityDataProvider textEntityDataProvider;

    @Override
    public String execute() {
        try {
            return textEntityDataProvider.getAllTexts().getLast();
        } catch (Exception e) {
            return "Ainda está vazio!";
        } finally {
            final var newText = LocalDateTime.now().toString();
            textEntityDataProvider.addText(newText);
            log.info("Novo Text adicionado: {}", newText);
        }
    }
}
