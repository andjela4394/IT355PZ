package com.metropolitan.pz.repository;

import com.metropolitan.pz.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Custom query methods or additional operations
}
