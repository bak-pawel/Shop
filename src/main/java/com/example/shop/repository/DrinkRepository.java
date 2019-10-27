package com.example.shop.repository;

import com.example.shop.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrinkRepository extends JpaRepository <Drink, Integer> {

    List<Drink> findDrinkByName(String drinkName);
}
