package com.DTOs;

import java.math.BigDecimal;

public record LoanRequestDTO(String name, int age, String cpf, Double income, String location) {
}
