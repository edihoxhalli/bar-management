package com.bar.barmanagement.rest;

import com.bar.barmanagement.domain.service.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class GenericRestController <T, U>{
    private GenericService<T, U> service;

    public GenericRestController(){}

    public GenericRestController(GenericService<T, U> service){
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

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }


}
