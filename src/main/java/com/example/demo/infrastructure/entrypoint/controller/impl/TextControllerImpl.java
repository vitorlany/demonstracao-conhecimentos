package com.example.demo.infrastructure.entrypoint.controller.impl;

import com.example.demo.core.application.ITextApplication;
import com.example.demo.infrastructure.entrypoint.controller.ITextController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TextControllerImpl implements ITextController {
    private final ITextApplication textApplication;

    @Override
    public String generateRandomText() {
        return textApplication.generateRandomText();
    }
}
