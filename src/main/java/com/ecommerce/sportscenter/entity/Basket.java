package com.ecommerce.sportscenter.entity;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="basket")
public class Basket {
    @Id
    private String id;
    private List<BasketItem> items = new ArrayList<>();
    public Basket(String id) {
        this.id = id;
    }
}
