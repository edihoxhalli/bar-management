package com.bar.barmanagement.domain.mapper;

import com.bar.barmanagement.domain.dto.Product;
import org.mapstruct.Mapper;
import org.springframework.core.GenericTypeResolver;

@Mapper(componentModel = "spring")
public abstract class ProductMapper extends BidirectionalMapper<Product, com.bar.barmanagement.model.entity.Product> {

}
