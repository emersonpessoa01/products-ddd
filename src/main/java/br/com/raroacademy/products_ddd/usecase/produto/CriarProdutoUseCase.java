package br.com.raroacademy.products_ddd.usecase.produto;


import br.com.raroacademy.products_ddd.domain.produto.entity.Product;
import br.com.raroacademy.products_ddd.infraestructure.db.jpa.repository.ProductRepository;

public class CriarProdutoUseCase {
    private final ProductRepository productRepository;

    public CriarProdutoUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void execute(Product product) {
        productRepository.save(product);
    }
}
