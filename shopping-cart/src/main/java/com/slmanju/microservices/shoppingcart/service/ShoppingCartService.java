package com.slmanju.microservices.shoppingcart.service;

import com.slmanju.microservices.shoppingcart.service.view.Bill;
import com.slmanju.microservices.shoppingcart.service.view.Cart;

public interface ShoppingCartService {

    Bill checkBill(Cart cart);

}
