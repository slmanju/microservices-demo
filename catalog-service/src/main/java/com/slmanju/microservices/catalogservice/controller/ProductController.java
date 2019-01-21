package com.slmanju.microservices.catalogservice.controller;

import com.slmanju.microservices.catalogservice.service.ProductService;
import com.slmanju.microservices.catalogservice.service.ProductView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductView>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

}
