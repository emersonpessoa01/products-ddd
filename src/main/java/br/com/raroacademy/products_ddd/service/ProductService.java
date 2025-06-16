package br.com.raroacademy.products_ddd.service;

import br.com.raroacademy.products_ddd.domain.dto.ProductDTO;
import br.com.raroacademy.products_ddd.domain.entity.Product;
import br.com.raroacademy.products_ddd.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(ProductDTO productDTO) {
//        Product product = ProductMapper.toEntity(productDTO);
//
//        // Aqui você pode persistir o produto no banco de dados com o repositório
////        System.out.println(product);
//        productRepository.save(product);
        // Exemplo de uso do ProductMapper para converter ProductDTO em Product

        // Aqui você pode adicionar lógica adicional, como retornar o produto salvo ou realizar outras operações
        Product productEntity = Product.toProduct(productDTO);
        productRepository.save(productEntity);

    }

    public ProductRepository getProduct() {
        return productRepository;
    }
}
