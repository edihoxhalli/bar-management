package com.bar.barmanagement.domain.mapper;


import org.mapstruct.factory.Mappers;
import org.springframework.core.GenericTypeResolver;

import java.util.List;


public abstract class BidirectionalMapper <T, U>{
    private Class<?>[] genericTypes;
    public BidirectionalMapper(){
        this.genericTypes = GenericTypeResolver.resolveTypeArguments(getClass(), BidirectionalMapper.class);
    }

    public Class<?>[] getGenericTypes(){
        return this.genericTypes;
    }

    public abstract T toDto(U product);
    public abstract U toEntity(T product);
    public abstract List<T> toDtos(List<U> product);
    public abstract List<U> toEntities(List<T> product);
}
