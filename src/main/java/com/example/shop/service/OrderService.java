package com.example.shop.service;

import com.example.shop.model.Drink;
import com.example.shop.repository.DrinkRepository;
import org.springframework.stereotype.Service;

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

           return (Set<Drink>) drinkRepository.findAll();
       }
        return drinkRepository.findDrinkByName(drinkName);

    }
    public Set<Drink> findAllDrink(){
        return (Set<Drink>) drinkRepository.findAll();
    }
    public Optional<Drink> findById(int id){
       return drinkRepository.findById(id);
    }
    public int getQuantity(int id){
        Optional<Drink> quantity = drinkRepository.findById(id);
       return quantity.get().getAvailability();
    }
    public int setQuantity(int substraction){
        return drinkRepository.setQuantity(substraction);
    }

}