package com.bar.barmanagement.domain.mapper;


import java.util.List;


public abstract class BidirectionalMapper <T, U>{
    private Class<?>[] VjolaTypes;

    public abstract T toDto(U product);
    public abstract U toEntity(T product);
    public abstract List<T> toDtos(List<U> product);
    public abstract List<U> toEntities(List<T> product);
}
