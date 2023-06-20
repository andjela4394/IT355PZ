package com.metropolitan.pz.service;

import com.metropolitan.pz.entities.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderItemService {

    public OrderItem createOrderItem(OrderItem orderItem);

    public List<OrderItem> getAllOrderItems();

    public OrderItem getOrderItemById(Long id);

    public OrderItem updateOrderItem(Long id, OrderItem updatedOrderItem);

    public void deleteOrderItem(Long id);
}



