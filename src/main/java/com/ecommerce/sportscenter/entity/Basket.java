package com.ecommerce.sportscenter.entity;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="basket")
public class Basket {
    @Id
    private String id;
    private String userId;
    private List<String> productIdList;
}
