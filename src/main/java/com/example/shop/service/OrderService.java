package com.example.shop.service;

import com.example.shop.model.Drink;
import com.example.shop.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service
public class OrderService {
    private final DrinkRepository drinkRepository;

    public OrderService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public Set<Drink> findDrinkByName(String drinkName) {
       if(drinkName==null|| drinkName.equals("")){

           return new HashSet<>( drinkRepository.findAll());
       }
        return drinkRepository.findDrinkByName(drinkName);

    }
    public Set<Drink> findAllDrink(){
        return new HashSet<>(drinkRepository.findAll());
    }
    public Optional<Drink> findById(int id){
       return drinkRepository.findById(id);
    }

    public void save(Drink drink) {
        drinkRepository.save(drink);
    }
}