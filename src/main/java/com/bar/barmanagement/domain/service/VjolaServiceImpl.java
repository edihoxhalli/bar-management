package com.bar.barmanagement.domain.service;

import com.bar.barmanagement.domain.mapper.BidirectionalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public abstract class VjolaServiceImpl<T, U> implements VjolaService<T>{

    private JpaRepository<U, Long> repository;
    private BidirectionalMapper<T, U> mapper;

    @Autowired
    public VjolaServiceImpl(JpaRepository<U, Long> repository, BidirectionalMapper<T, U> mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<T> getAll() {
        List<U> entities = repository.findAll();
        return mapper.toDtos(entities);
    }

    public T getById(Long id) {
        return (T) mapper.toDto(repository.findById(id).get());
    }

    public T save(Object t) {
        U entity = (U) mapper.toEntity((T) t);
        entity = repository.save(entity);
        T dto = this.mapper.toDto(entity);
        return dto;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
