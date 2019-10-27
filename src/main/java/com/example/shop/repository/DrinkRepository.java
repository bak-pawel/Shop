package com.example.shop.repository;

import com.example.shop.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository <Drink, Integer> {
}
