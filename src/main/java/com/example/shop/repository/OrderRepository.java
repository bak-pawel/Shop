package com.example.shop.repository;

import com.example.shop.model.NewOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <NewOrder,Integer> {
}
