package com.example.demo.infrastructure.controller.request;

public record RegisterPersonRequest(
        String name,
        String cpf
) {
}
