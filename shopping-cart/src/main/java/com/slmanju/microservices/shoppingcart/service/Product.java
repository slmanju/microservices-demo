package com.slmanju.microservices.shoppingcart.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
class Product {

    private String id;
    private Integer price;

}
