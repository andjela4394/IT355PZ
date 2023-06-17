package com.metropolitan.pz.repository;

import com.metropolitan.pz.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Add custom query methods if needed
}

