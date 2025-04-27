package com.example.demo.infrastructure.entrypoint.controller.request;

public record RegisterPersonRequestBody(
        String name,
        String cpf
) {
}
