//package br.com.raroacademy.products.mapper;
//
//import br.com.raroacademy.products.domain.dto.ProductDTO;
//import br.com.raroacademy.products.domain.entity.Product;
//
//public class ProductMapper {
////Faz o mapeamento entre ProductDTO e Product
//    public static Product toEntity(ProductDTO dto) {
//        return new Product(
//                dto.id(),
//                dto.name(),
//                dto.price(),
//                dto.status()
//        );
//    }
//// Faz o mapeamento entre Product e ProductDTO
//    public static ProductDTO toDTO(Product entity) {
//        return new ProductDTO(
//                entity.getId(),
//                entity.getName(),
//                entity.getPrice(),
//                entity.getStatus()
//        );
//    }
//}
