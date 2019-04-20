package com.bar.barmanagement.model.repository;

import com.bar.barmanagement.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
