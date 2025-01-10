package com.ecommerce.sportscenter.service;

import java.util.List;

import com.ecommerce.sportscenter.entity.Basket;
import com.ecommerce.sportscenter.model.BasketResponse;

public interface BasketService {
    public Basket save(Basket basket);
    public List<Basket> all();
    public Basket getBasketById(String id);


    List<BasketResponse> getAllBaskets();
    //BasketResponse getBasketById(String basketId);
    void deleteBasketById(String basketId);
    BasketResponse createBasket(Basket basket);
}
