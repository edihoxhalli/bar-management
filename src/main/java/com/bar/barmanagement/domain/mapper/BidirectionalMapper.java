package com.bar.barmanagement.domain.mapper;

import com.bar.barmanagement.domain.dto.Product;
import org.mapstruct.Mapper;

@Mapper
public interface BidirectionalMapper <T, U>{
    T toDto(U product);
    U toEntity(T product);
}
