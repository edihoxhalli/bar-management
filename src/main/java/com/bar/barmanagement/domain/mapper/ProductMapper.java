package com.bar.barmanagement.domain.mapper;

import com.bar.barmanagement.domain.dto.ProductDto;
import com.bar.barmanagement.model.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ProductMapper extends BidirectionalMapper<ProductDto, ProductEntity> {

}
