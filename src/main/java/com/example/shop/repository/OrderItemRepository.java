package com.example.shop.repository;

import com.example.shop.model.NewOrder;
import com.example.shop.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByNewOrder(NewOrder newOrder);
    Optional<OrderItem> findByItem_IdAndNewOrder_Id(int item_id, int newOrder_Id);

}
