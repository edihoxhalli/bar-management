package com.bar.barmanagement.rest;

import com.bar.barmanagement.domain.dto.Product;
import com.bar.barmanagement.domain.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductRestController extends GenericRestController<Product, com.bar.barmanagement.model.entity.Product>{
    private ProductService<Product> service;

    public ProductRestController(ProductService<Product> service){
        super(service);
        this.service = service;
    }
}
