package com.slmanju.microservices.shoppingcart.service;

import com.slmanju.microservices.shoppingcart.service.view.Product;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RibbonClient(name = "catalog-service")
@FeignClient(name = "catalog-service")
public interface CatalogService {

    @GetMapping("/{id}")
    Product findProduct(@PathVariable("id") String id);

}
