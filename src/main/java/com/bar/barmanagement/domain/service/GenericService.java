package com.bar.barmanagement.domain.service;

import java.util.List;

public interface GenericService <T, U>{
    List<T> getAll();
    T getById(Long id);
    void save(T t);
    void delete(Long id);
}
