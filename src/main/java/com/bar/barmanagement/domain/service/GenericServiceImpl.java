package com.bar.barmanagement.domain.service;

import com.bar.barmanagement.domain.mapper.BidirectionalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericServiceImpl<T, U> implements GenericService{
    @Autowired
    private JpaRepository<T, Long> repository;

    @Autowired
    BidirectionalMapper<T, U> mapper;

    public List<T> getAll() {
        return repository.findAll();
    }

    public T getById(Long id) {
        return (T) repository.findById(id);
    }

    public void save(Object t) {
        repository.save((T) t);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
