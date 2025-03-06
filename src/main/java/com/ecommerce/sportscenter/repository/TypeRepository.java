package com.ecommerce.sportscenter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sportscenter.entity.Type;

@Repository
public interface TypeRepository extends MongoRepository<Type, Integer> {
}
