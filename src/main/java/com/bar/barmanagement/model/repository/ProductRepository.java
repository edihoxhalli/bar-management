package com.bar.barmanagement.model.repository;

import com.bar.barmanagement.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
