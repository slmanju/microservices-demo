package com.slmanju.microservices.shoppingcart.controller;

import com.slmanju.microservices.shoppingcart.service.ShoppingCartService;
import com.slmanju.microservices.shoppingcart.service.view.Bill;
import com.slmanju.microservices.shoppingcart.service.view.Cart;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @PostMapping("/bill")
    public ResponseEntity<Bill> checkBill(@RequestBody Cart cart) {
        return ResponseEntity.ok(shoppingCartService.checkBill(cart));
    }

}
