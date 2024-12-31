package lk.UOK.crm.service;



import lk.UOK.crm.entity.Basket;
import lk.UOK.crm.model.BasketResponse;

import java.util.List;

public interface BasketService {
    List<BasketResponse> getAllBaskets();
    BasketResponse getBasketById(String basketId);
    void deleteBasketById(String basketId);
    BasketResponse createBasket(Basket basket);
}
