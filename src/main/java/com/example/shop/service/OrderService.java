package com.example.shop.service;

import com.example.shop.model.Drink;
import com.example.shop.model.NewOrder;
import com.example.shop.model.OrderItem;
import com.example.shop.repository.DrinkRepository;
import com.example.shop.repository.OrderItemRepository;
import com.example.shop.session.UserSessionProvider;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Service
public class OrderService {
    private final DrinkRepository drinkRepository;
    private final OrderItemRepository orderItemRepository;
    private final NewOrder newOrder;
private final UserSessionProvider userSessionProvider;

    public OrderService(DrinkRepository drinkRepository, OrderItemRepository orderItemRepository, NewOrder newOrder, UserSessionProvider userSessionProvider) {
        this.drinkRepository = drinkRepository;
        this.orderItemRepository = orderItemRepository;
        this.newOrder = newOrder;
        this.userSessionProvider = userSessionProvider;
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

    public void order(Drink drink, int availability) {
        drinkRepository.save(drink); //sciagamy ze stanu
        //pobierz niezrealizowany order dla zalogowanego usera, jesli nie ma to stworz nowy
        userSessionProvider.getLoggedUser();
       // if(){

       // }

        OrderItem item = new OrderItem();//element w koszu
        item.setDrink(drink);
        item.setAmount(availability);
       // item.setNewOrder();
        orderItemRepository.save(item);
    }

}