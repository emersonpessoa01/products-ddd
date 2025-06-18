package br.com.raroacademy.products_ddd.infraestructure.db.jpa.repository;

import br.com.raroacademy.products_ddd.domain.produto.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
