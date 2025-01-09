package com.ecommerce.sportscenter.entity;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="type")
public class Type {
    @Id
    private Integer id;
    private String name;
    private List<String> prodctIdList;
}
