package com.bar.barmanagement.domain.service;

import com.bar.barmanagement.domain.dto.Product;
import com.bar.barmanagement.domain.mapper.ProductMapper;
import com.bar.barmanagement.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, com.bar.barmanagement.model.entity.Product> implements ProductService<Product> {

    private ProductRepository repository;
    private ProductMapper mapper;

    @Autowired
    public ProductServiceImpl(ProductRepository repository, ProductMapper mapper){
        super(repository, mapper);
    }
}
