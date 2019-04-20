package com.bar.barmanagement.rest;

import com.bar.barmanagement.domain.service.VjolaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class VjolaRestController<T, U>{
    private VjolaService<T> service;

    public VjolaRestController(){}

    public VjolaRestController(VjolaService<T> service){
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
    public T save(@RequestBody T t){
        return service.save(t);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }


}
