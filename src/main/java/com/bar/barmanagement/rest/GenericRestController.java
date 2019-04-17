package com.bar.barmanagement.rest;

import com.bar.barmanagement.domain.service.GenericService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class GenericRestController <T>{
    private GenericService<T> service;

    public GenericRestController(){}

    public GenericRestController(GenericService<T> service){
        this.service = service;
    }

    @GetMapping("/all")
    public List<T> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody T t){
        service.save(t);
    }

    @GetMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }


}
