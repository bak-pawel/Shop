package com.example.shop.repository;

import com.example.shop.model.NewOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface OrderRepository extends JpaRepository <NewOrder,Integer> {
    Optional<NewOrder> findByUser_UserNameAndFinishedIsFalse(String user);
}
