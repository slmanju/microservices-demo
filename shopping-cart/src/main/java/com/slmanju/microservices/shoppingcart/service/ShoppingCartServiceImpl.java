package com.slmanju.microservices.shoppingcart.service;

import com.slmanju.microservices.shoppingcart.service.view.Bill;
import com.slmanju.microservices.shoppingcart.service.view.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ProductClient productClient;

    @Autowired
    public ShoppingCartServiceImpl(ProductClient productClient) {
        this.productClient = productClient;
    }

    @Override
    public Bill checkBill(Cart cart) {
        Integer total = cart.getCartItems()
                .stream()
                .map(cartItem -> {
                    Product product = productClient.findProduct(cartItem.getProductId());
                    return cartItem.getQuantity() * product.getPrice();
                }).reduce(0, (result, source) -> result + source);
        return Bill.builder().totalAmount(total).build();
    }

}
