package com.example.shop.repository;

import com.example.shop.model.NewOrder;
import com.example.shop.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByNewOrder(NewOrder newOrder);
}
