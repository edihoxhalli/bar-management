package com.bar.barmanagement.domain.service;

import java.util.List;

public interface VjolaService <T>{
    List<T> getAll();
    T getById(Long id);
    T save(T t);
    void delete(Long id);
}
