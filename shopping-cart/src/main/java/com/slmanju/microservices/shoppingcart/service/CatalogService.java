package com.slmanju.microservices.shoppingcart.service;

import com.slmanju.microservices.shoppingcart.service.view.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "localhost:8010")
public interface CatalogService {

    @GetMapping("/{id}")
    Product findProduct(@PathVariable("id") String id);

}
