package br.com.raroacademy.products_ddd.controllers.produto;

import br.com.raroacademy.products_ddd.domain.produto.dto.ProductDTO;
import br.com.raroacademy.products_ddd.domain.produto.entity.Product;
import br.com.raroacademy.products_ddd.service.produto.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


public class ProductControllerImpl implements ProductController {
    @Autowired
    private final ProductService productService;

    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<Product> createProduct(ProductDTO productDTO) {
        productService.createProduct(productDTO);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Product> getProduct() {
        // Chama o serviço para obter o produto
        Product product = productService.getProduct().findAll().get(0); // Exemplo de obtenção do primeiro produto

        // Retorna o produto encontrado
        return ResponseEntity.ok(product);

    }


}
