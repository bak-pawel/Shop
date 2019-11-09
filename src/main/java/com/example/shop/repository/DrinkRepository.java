package com.example.shop.repository;

import com.example.shop.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface DrinkRepository extends JpaRepository <Drink, Integer> {

    Set<Drink> findDrinkByName(String drinkName);
    @Query(value = "SELECT * FROM DRINK ", nativeQuery = true)
    Set<Drink> findAllDrinks();
}
