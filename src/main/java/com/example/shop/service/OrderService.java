package com.example.shop.service;

import com.example.shop.model.Drink;
import com.example.shop.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final DrinkRepository drinkRepository;

    public OrderService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public List<Drink> findDrinkByName(String drinkName) {
       if(drinkName!=null){
           return drinkRepository.findDrinkByName(drinkName);
       }
       return drinkRepository.findAll();

    }
}