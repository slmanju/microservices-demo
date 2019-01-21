package com.slmanju.microservices.catalogservice.domain;

import com.slmanju.microservices.catalogservice.service.ProductView;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ms_product")
@Data @NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(generator="uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid")
    private String id;
    private Integer price;

    public ProductView view() {
        return ProductView.builder().id(id).price(price).build();
    }

}
