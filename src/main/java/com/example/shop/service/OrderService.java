package com.example.shop.service;

import com.example.shop.repository.DrinkRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final DrinkRepository shopRepostory;

    public OrderService(DrinkRepository drinkRepository){
        this.shopRepostory = drinkRepository;
    }
}
