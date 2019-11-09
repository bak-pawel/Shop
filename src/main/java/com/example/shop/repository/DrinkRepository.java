package com.example.shop.repository;

import com.example.shop.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Set;

public interface DrinkRepository extends JpaRepository <Drink, Integer> {

    Set<Drink> findDrinkByName(String drinkName);

    int setQuantity(int substraction);
}
