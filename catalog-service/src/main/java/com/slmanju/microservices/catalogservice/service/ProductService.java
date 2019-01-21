package com.slmanju.microservices.catalogservice.service;

import java.util.List;

public interface ProductService {

    List<ProductView> findAll();

    ProductView findById(String id);

}
