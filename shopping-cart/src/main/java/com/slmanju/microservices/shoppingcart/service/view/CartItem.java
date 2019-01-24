package com.slmanju.microservices.shoppingcart.service.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CartItem {

    private String productId;
    private Integer quantity;

}
