package com.example.shop.service;

import com.example.shop.model.Drink;
import com.example.shop.model.OrderItem;
import com.example.shop.repository.DrinkRepository;
import com.example.shop.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service
public class OrderService {
    private final DrinkRepository drinkRepository;
    private final OrderItemRepository orderItemRepository;

    public OrderService(DrinkRepository drinkRepository, OrderItemRepository orderItemRepository) {
        this.drinkRepository = drinkRepository;
        this.orderItemRepository = orderItemRepository;
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

    public void save(Drink drink, int availability) {
        drinkRepository.save(drink);
        OrderItem item = new OrderItem();
        item.setDrink(drink);
        item.setAmount(availability);
        orderItemRepository.save(item);
    }

}