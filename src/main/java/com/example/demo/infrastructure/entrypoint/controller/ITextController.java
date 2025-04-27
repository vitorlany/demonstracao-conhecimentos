package com.example.demo.infrastructure.entrypoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/text")
public interface ITextController {

    @GetMapping
    String generateRandomText();
}
