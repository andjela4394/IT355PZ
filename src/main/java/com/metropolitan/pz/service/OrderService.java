package com.metropolitan.pz.service;

import com.metropolitan.pz.entities.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getAllOrders();

    public Order getOrderById(Long id);

    public Order createOrder(Order order);

    public Order updateOrder(Long id, Order updatedOrder);

    public void deleteOrder(Long id);
}
