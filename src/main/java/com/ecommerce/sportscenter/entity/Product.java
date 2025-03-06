package com.ecommerce.sportscenter.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Data
@Document(collection="product")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private Long price;
    private String pictureUrl;
    private Brand brand;
    private Type type;
}
