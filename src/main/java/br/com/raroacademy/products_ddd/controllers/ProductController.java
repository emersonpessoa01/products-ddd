package br.com.raroacademy.products_ddd.controllers;

import br.com.raroacademy.products_ddd.domain.dto.ProductDTO;
import br.com.raroacademy.products_ddd.domain.entity.Product;
import br.com.raroacademy.products_ddd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping()
    public ResponseEntity<Product> createProduct(@RequestBody @Validated ProductDTO productDTO) {
        // Chama o serviço para criar o produto
        productService.createProduct(productDTO);

        // Aqui você pode adicionar lógica adicional, como retornar uma resposta ou realizar outras operações
        // Por exemplo, retornar um status HTTP 201 Created
         return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping
    public ResponseEntity<Product> getProduct() {
        // Chama o serviço para obter o produto
        Product product = productService.getProduct().findAll().get(0); // Exemplo de obtenção do primeiro produto

        // Retorna o produto encontrado
        return ResponseEntity.ok(product);

    }

}
