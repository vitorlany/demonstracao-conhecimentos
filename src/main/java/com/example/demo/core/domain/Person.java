package com.example.demo.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String cpf;
}
