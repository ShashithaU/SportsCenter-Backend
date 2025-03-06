package com.ecommerce.sportscenter.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecommerce.sportscenter.entity.Product;
import com.ecommerce.sportscenter.model.ProductResponse;
import com.ecommerce.sportscenter.repository.ProductRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponse getProductById(Integer productId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
    }

    @Override
    public Page<ProductResponse> getProducts(Pageable pageable, Integer brandId, Integer typeId, String keyword) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProducts'");
    }

    @Override
    public Product save(Product product) {
       return productRepository.save(product);
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
//     @Override
//     public ProductResponse getProductById(Integer productId) {
//         log.info("fetching Product by Id: {}", productId);
//         Product product = productRepository.findById(productId)
//                 .orElseThrow(()->new ProductNotFoundException("Product doesn't exist"));
//         //now convert the Product to Product Response
//         ProductResponse productResponse = convertToProductResponse(product);
//         log.info("Fetched Product by Product Id: {}", productId);
//         return productResponse;
//     }

//     @Override
// public Page<ProductResponse> getProducts(Pageable pageable, Integer brandId, Integer typeId, String keyword) {
//     Query query = new Query();

//     // Add filters dynamically
//     if (brandId != null) {
//         query.addCriteria(Criteria.where("brand.id").is(brandId));
//     }

//     if (typeId != null) {
//         query.addCriteria(Criteria.where("type.id").is(typeId));
//     }

//     if (keyword != null && !keyword.isEmpty()) {
//         query.addCriteria(Criteria.where("name").regex(".*" + keyword + ".*", "i")); // Case-insensitive search
//     }

//     // Apply pagination
//     long total = mongoTemplate.count(query, Product.class);
//     query.with(pageable);

//     // Fetch results
//     List<Product> products = mongoTemplate.find(query, Product.class);

//     // Convert and return paginated results
//     List<ProductResponse> responses = products.stream()
//         .map(this::convertToProductResponse)
//         .toList();

//     return new PageImpl<>(responses, pageable, total);
// }

//     private ProductResponse convertToProductResponse(Product product) {
//         return ProductResponse.builder()
//                 .id(product.getId())
//                 .name(product.getName())
//                 .description(product.getDescription())
//                 .price(product.getPrice())
//                 .pictureUrl(product.getPictureUrl())
//                 .productBrand(product.getBrand().getName())
//                 .productType(product.getType().getName())
//                 .build();
//     }
}
