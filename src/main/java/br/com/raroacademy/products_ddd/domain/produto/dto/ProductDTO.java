package br.com.raroacademy.products_ddd.domain.produto.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ProductDTO(

        Long id,
        @NotBlank(message = "O nome do produto é obrigatório")
        String name,
        @Min(1)
        BigDecimal price,
        Boolean status
) {
}
