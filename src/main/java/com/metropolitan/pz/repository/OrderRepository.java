package com.metropolitan.pz.repository;

import com.metropolitan.pz.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Add custom query methods if needed
}

