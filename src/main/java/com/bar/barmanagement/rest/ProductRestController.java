package com.bar.barmanagement.rest;

import com.bar.barmanagement.domain.dto.ProductDto;
import com.bar.barmanagement.domain.service.ProductService;
import com.bar.barmanagement.model.entity.ProductEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductRestController extends VjolaRestController<ProductDto, ProductEntity> {
    private ProductService service;

    public ProductRestController(ProductService<ProductDto> service){
        super(service);
        this.service = service;
    }
}
