package com.slmanju.microservices.shoppingcart.service.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Product {

    private String id;
    private Integer price;

}
