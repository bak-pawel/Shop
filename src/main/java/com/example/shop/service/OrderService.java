package com.example.shop.service;

import com.example.shop.model.Drink;
import com.example.shop.model.NewOrder;
import com.example.shop.model.OrderItem;
import com.example.shop.model.User;
import com.example.shop.repository.DrinkRepository;
import com.example.shop.repository.OrderItemRepository;
import com.example.shop.repository.OrderRepository;
import com.example.shop.session.UserSessionProvider;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class OrderService {
    private final DrinkRepository drinkRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderRepository orderRepository;
    private final UserSessionProvider userSessionProvider;


    public OrderService(DrinkRepository drinkRepository, OrderItemRepository orderItemRepository, OrderRepository orderRepository, UserSessionProvider userSessionProvider) {
        this.drinkRepository = drinkRepository;
        this.orderItemRepository = orderItemRepository;
        this.orderRepository = orderRepository;
        this.userSessionProvider = userSessionProvider;
    }

    public Set<Drink> findDrinkByName(String drinkName) {
        if (drinkName == null || drinkName.equals("")) {

            return new HashSet<>(drinkRepository.findAll());
        }
        return drinkRepository.findDrinkByName(drinkName);

    }

    public Set<Drink> findAllDrink() {
        return new HashSet<>(drinkRepository.findAll());
    }

    public Optional<Drink> findById(int id) {
        return drinkRepository.findById(id);
    }

    public void order(Drink drink, int orderedAmount) {
        drinkRepository.save(drink); //sciagamy ze stanu
        //pobierz niezrealizowany order dla zalogowanego usera, jesli nie ma to stworz nowy
        User loggedUser = userSessionProvider.getLoggedUser();
        Optional<NewOrder> cart = orderRepository.findByUser_UserAndFinishedIsFalse(loggedUser.getUsername());
        if (cart.isPresent()) {
            OrderItem item = new OrderItem();//element w koszu
            item.setDrink(drink);
            item.setAmount(orderedAmount);
            item.setNewOrder(cart.get());
            orderItemRepository.save(item);
        } else {
            NewOrder newOrder = new NewOrder(); // tworzymy nowe zamówienie
            newOrder.setUser(loggedUser); //ustawiamy usera dla tego zamówienia
            NewOrder savedOrder = orderRepository.save(newOrder); // zapisujemy ten koszyk dla usera
            OrderItem item = new OrderItem();//element w koszu
            item.setDrink(drink); // ustawiamy element zamówiony w koszyku
            item.setAmount(orderedAmount); //ustawiamy ilość któeą klient zamówił
            item.setNewOrder(savedOrder); // ustawiamy zamówienie z produktem
            orderItemRepository.save(item); // zapisujemy element zamówienia
        }
    }

    public Set<OrderItem> printCart() {

        Optional<NewOrder> cart = orderRepository.findByUser_UserAndFinishedIsFalse(userSessionProvider.getLoggedUser().getUsername());
        if(cart.isPresent()) {
            return new HashSet<>(orderItemRepository.findByNewOrder(cart.get()));
        }else {
            return new HashSet<>();
        }
    }
    public void buy() {
        Optional<NewOrder> cart = orderRepository.findByUser_UserAndFinishedIsFalse(userSessionProvider.getLoggedUser().getUsername());
        NewOrder newOrder = cart.get();
        newOrder.setFinished(true);
        orderRepository.save(newOrder);
    }
    public void delete(int itemId) {
        OrderItem one = orderItemRepository.getOne(itemId);
        Optional<Drink> byId = drinkRepository.findById(itemId);
        int availability = byId.get().getAvailability();
        byId.get().setAvailability(availability+one.getAmount());
        orderItemRepository.deleteById(itemId);
    drinkRepository.save(byId.get());


    }

}