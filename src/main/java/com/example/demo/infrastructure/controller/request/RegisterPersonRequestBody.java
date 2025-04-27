package com.example.demo.infrastructure.controller.request;

public record RegisterPersonRequestBody(
        String name,
        String cpf
) {
}
