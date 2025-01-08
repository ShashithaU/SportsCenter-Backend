package com.ecommerce.sportscenter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sportscenter.entity.Brand;

@Repository
public interface BrandRepository extends MongoRepository<Brand, Integer> {
}
