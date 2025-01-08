package com.ecommerce.sportscenter.entity;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="brand")
public class Brand {
    @Id
    private Integer id;
    private String name;
    private List<Product> prodcts;
}
