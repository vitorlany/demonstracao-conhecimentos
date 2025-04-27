package com.example.demo.infrastructure.controller;

import com.example.demo.core.application.ITextApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/text")
public class TextController {
    private final ITextApplication textApplication;

    @GetMapping
    public String generateRandomText() {
        return textApplication.generateRandomText();
    }
}
