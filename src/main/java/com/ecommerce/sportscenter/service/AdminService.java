package com.ecommerce.sportscenter.service;

import org.springframework.stereotype.Service;

import com.ecommerce.sportscenter.entity.Product;
import com.ecommerce.sportscenter.repository.ProductRepository;

@Service
public class AdminService {
    private final ProductRepository productRepository;

    public AdminService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }


    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
