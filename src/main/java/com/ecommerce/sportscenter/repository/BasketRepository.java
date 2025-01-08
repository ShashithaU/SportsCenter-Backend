package com.ecommerce.sportscenter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sportscenter.entity.Basket;

@Repository
public interface BasketRepository extends MongoRepository<Basket, String>{
    // Basket findByBasketId(String basketId);
    // void deleteByBasketId(String basketId);
}
