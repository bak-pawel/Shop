package com.example.shop.service;

import com.example.shop.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
    OrderRepository orderRepository;

    public OrderItemService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
