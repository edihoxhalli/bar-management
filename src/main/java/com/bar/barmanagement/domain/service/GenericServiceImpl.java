package com.bar.barmanagement.domain.service;

import com.bar.barmanagement.domain.mapper.BidirectionalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static java.util.stream.Collectors.toList;

public abstract class GenericServiceImpl<T, U> implements GenericService<T, U>{

    private JpaRepository<U, Long> repository;
    private BidirectionalMapper<T, U> mapper;

    @Autowired
    public GenericServiceImpl(JpaRepository<U, Long> repository, BidirectionalMapper<T, U> mapper){
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

    public void save(Object t) {
        U entity = (U) mapper.toEntity((T) t);
        repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
