package br.com.cesarfcg.productscrud.Dto.Request;

import jakarta.validation.constraints.NotBlank;

public record LoginRequestDTO(@NotBlank String login, @NotBlank String password) {
}
