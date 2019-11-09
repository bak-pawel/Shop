package com.example.shop.service;

import com.example.shop.model.Drink;
import com.example.shop.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
public class OrderService {
    private final DrinkRepository drinkRepository;

    public OrderService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public Set<Drink> findDrinkByName(String drinkName) {
       if(drinkName==null|| drinkName.equals("")){
           return drinkRepository.findAllDrinks();
       }
        return drinkRepository.findDrinkByName(drinkName);

    }
    public Set<Drink> findAllDrink(){
        return drinkRepository.findAllDrinks();
    }
}