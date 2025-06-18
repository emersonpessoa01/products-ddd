package br.com.raroacademy.products_ddd.service.produto;

import br.com.raroacademy.products_ddd.domain.produto.dto.ProductDTO;
import br.com.raroacademy.products_ddd.domain.produto.entity.Product;
import br.com.raroacademy.products_ddd.infraestructure.db.jpa.repository.ProductRepository;
import br.com.raroacademy.products_ddd.usecase.produto.CriarProdutoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final CriarProdutoUseCase criarProdutoUseCase;

    public ProductService(CriarProdutoUseCase criarProdutoUseCase) {
        this.criarProdutoUseCase = criarProdutoUseCase;
    }

    public void createProduct(ProductDTO productDTO) {
        // Aqui você pode chamar o caso de uso para criar o produto
        criarProdutoUseCase.execute(productDTO.toProduct(productDTO));
    }


}
