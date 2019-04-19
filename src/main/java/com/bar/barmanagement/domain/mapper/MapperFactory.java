package com.bar.barmanagement.domain.mapper;

import org.mapstruct.factory.Mappers;

public class MapperFactory {
    public static BidirectionalMapper getMapper(BidirectionalMapper<?, ?> mapper){
        if(mapper.getGenericTypes()[0].getName().equals("Product"))
            return Mappers.getMapper(ProductMapper.class);
        return null;
    }
}
