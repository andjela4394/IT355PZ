package com.metropolitan.pz.repository;

import com.metropolitan.pz.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    // Additional methods if needed
    void deleteByUserId(Long userId);

    @Query("SELECT c FROM Cart c WHERE c.userId = :userId")
    List<Cart> findByUserId(Long userId);
}

