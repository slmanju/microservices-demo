package com.slmanju.microservices.shoppingcart.service.view;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Bill {

    private Integer totalAmount;

}
