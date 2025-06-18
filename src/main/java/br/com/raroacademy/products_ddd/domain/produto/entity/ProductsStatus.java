package br.com.raroacademy.products_ddd.domain.produto.entity;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class ProductsStatus
{
    Product product;
    @Column
    private Boolean status;
    private LocalDateTime dataAtualizacao;
}
