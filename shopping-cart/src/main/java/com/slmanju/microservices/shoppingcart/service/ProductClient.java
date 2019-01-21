package com.slmanju.microservices.shoppingcart.service;

import org.springframework.stereotype.Component;

@Component
class ProductClient {

    Product findProduct(String id) {
        return new Product(id, 100);
    }

}
