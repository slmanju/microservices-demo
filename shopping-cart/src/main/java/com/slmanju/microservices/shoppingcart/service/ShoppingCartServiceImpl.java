package com.slmanju.microservices.shoppingcart.service;

import com.slmanju.microservices.shoppingcart.service.view.Bill;
import com.slmanju.microservices.shoppingcart.service.view.Cart;
import com.slmanju.microservices.shoppingcart.service.view.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final CatalogService catalogService;

    @Autowired
    public ShoppingCartServiceImpl(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @Override
    public Bill checkBill(Cart cart) {
        Integer total = cart.getCartItems()
                .stream()
                .map(cartItem -> {
                    Product product = catalogService.findProduct(cartItem.getProductId());
                    return cartItem.getQuantity() * product.getPrice();
                }).reduce(0, (result, source) -> result + source);
        return Bill.builder().totalAmount(total).build();
    }

}
