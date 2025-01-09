package com.ecommerce.sportscenter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sportscenter.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
