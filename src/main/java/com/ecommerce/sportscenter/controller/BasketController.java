package com.ecommerce.sportscenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sportscenter.entity.Basket;
import com.ecommerce.sportscenter.service.BasketService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/baskets")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping
    public String hello(){
        return "BasketController";
    }


    @PostMapping("/save")
    public Basket save(@RequestBody Basket entity) {
        
        return basketService.save(entity);
    }
    

    // @GetMapping
    // public List<BasketResponse> getAllBaskets() {
    //     return basketService.getAllBaskets();
    // }

    // @GetMapping("/{basketId}")
    // public BasketResponse getBasketById(@PathVariable String basketId){
    //     return basketService.getBasketById(basketId);
    // }
    // @DeleteMapping("/{basketId}")
    // public void deleteBasketById(@PathVariable String basketId){
    //     basketService.deleteBasketById(basketId);
    // }

    // @PostMapping
    // public ResponseEntity<BasketResponse> createBasket(@RequestBody BasketResponse basketResponse){
    //     //convert this basket response to basket entity
    //     Basket basket = convertToBasketEntity(basketResponse);
    //     //call the service method to create the basket
    //     BasketResponse createdBasket = basketService.createBasket(basket);
    //     //Return the Created Basket
    //     return new ResponseEntity<>(createdBasket, HttpStatus.CREATED);
    // }

    // private Basket convertToBasketEntity(BasketResponse basketResponse) {
    //     Basket basket = new Basket(basketResponse.getId());
    //     basket.setId(basketResponse.getId());
    //     basket.setItems(mapBasketItemResponsesToEntities(basketResponse.getItems()));
    //     return basket;
    // }

    // private List<BasketItem> mapBasketItemResponsesToEntities(List<BasketItemResponse> itemResponses) {
    //     return itemResponses.stream()
    //             .map(this::convertToBasketItemEntity)
    //             .collect(Collectors.toList());
    // }

    // private BasketItem convertToBasketItemEntity(BasketItemResponse itemResponse) {
    //     BasketItem basketItem = new BasketItem();
    //     basketItem.setId(itemResponse.getId());
    //     basketItem.setName(itemResponse.getName());
    //     basketItem.setDescription(itemResponse.getDescription());
    //     basketItem.setPrice(itemResponse.getPrice());
    //     basketItem.setPictureUrl(itemResponse.getPictureUrl());
    //     basketItem.setProductBrand(itemResponse.getProductBrand());
    //     basketItem.setProductType(itemResponse.getProductType());
    //     basketItem.setQuantity(itemResponse.getQuantity());
    //     return basketItem;
    // }
}
