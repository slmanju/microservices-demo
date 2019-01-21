package com.slmanju.microservices.catalogservice.service;

import com.slmanju.microservices.catalogservice.domain.Product;
import com.slmanju.microservices.catalogservice.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductView> findAll() {
        return productRepository.findAll()
                .stream()
                .map(Product::view)
                .collect(toList());
    }

    @Override
    public ProductView findById(String id) {
        return productRepository.findById(id).map(Product::view).orElse(null);
    }

}
