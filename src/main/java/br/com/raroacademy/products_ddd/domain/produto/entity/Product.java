package br.com.raroacademy.products_ddd.domain.produto.entity;

import br.com.raroacademy.products_ddd.domain.produto.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "products")
public class Product {
    @Id // Serve para identificar o campo como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // É utilizado para gerar o valor da chave primária automaticamente
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private BigDecimal price;


    public static Product toProduct(ProductDTO productDTO) {
        return new Product(
                productDTO.id(),
                productDTO.name(),
                productDTO.price()
        );
    }

}
