package br.com.cesarfcg.productscrud.Dto.Response;

import jakarta.validation.constraints.NotBlank;

public record UserResponseDTO( String name, @NotBlank String login, @NotBlank String password) {
}
