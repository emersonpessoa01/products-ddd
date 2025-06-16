package br.com.raroacademy.products_ddd.controllers;

import br.com.raroacademy.products_ddd.domain.dto.ProductDTO;
import br.com.raroacademy.products_ddd.domain.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public interface ProductController {
    @PostMapping
    ResponseEntity<Product> createProduct(@RequestBody @Validated ProductDTO productDTO);

    @GetMapping
    ResponseEntity<Product> getProduct();
}
