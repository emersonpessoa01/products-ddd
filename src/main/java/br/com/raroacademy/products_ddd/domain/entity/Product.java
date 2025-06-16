package br.com.raroacademy.products_ddd.domain.entity;

import br.com.raroacademy.products_ddd.domain.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


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
    @Column
    private Boolean status;

    public static Product toProduct(ProductDTO dto) {
        return new Product(
                dto.id(),
                dto.name(),
                dto.price(),
                dto.status() == null || dto.status()
        );
    }

}
