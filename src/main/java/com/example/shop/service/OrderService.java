package com.example.shop.service;

import com.example.shop.model.Drink;
import com.example.shop.model.NewOrder;
import com.example.shop.model.OrderItem;
import com.example.shop.model.User;
import com.example.shop.repository.DrinkRepository;
import com.example.shop.repository.MathRepository;
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
    private final MathRepository mathRepository;


    public OrderService(DrinkRepository drinkRepository, OrderItemRepository orderItemRepository, OrderRepository orderRepository, UserSessionProvider userSessionProvider, MathRepository mathRepository) {
        this.drinkRepository = drinkRepository;
        this.orderItemRepository = orderItemRepository;
        this.orderRepository = orderRepository;
        this.userSessionProvider = userSessionProvider;
        this.mathRepository = mathRepository;
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
        Optional<NewOrder> cart = orderRepository.findByUser_UserNameAndFinishedIsFalse(loggedUser.getUsername());
        if (cart.isPresent()) {
            Optional<OrderItem> byDrink_idAndNewOrder_id = orderItemRepository.findByDrink_IdAndNewOrder_Id(drink.getId(), cart.get().getId());
            if(byDrink_idAndNewOrder_id.isPresent()){
                OrderItem item = byDrink_idAndNewOrder_id.get();
                item.setAmount(item.getAmount()+orderedAmount);
                orderItemRepository.save(item);
            }else {
                OrderItem item = new OrderItem();//element w koszu
                item.setDrink(drink);
                item.setAmount(orderedAmount);
                item.setNewOrder(cart.get());
                orderItemRepository.save(item);
            }
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

        Optional<NewOrder> cart = orderRepository.findByUser_UserNameAndFinishedIsFalse(userSessionProvider.getLoggedUser().getUsername());
        if (cart.isPresent()) {
            return new HashSet<>(orderItemRepository.findByNewOrder(cart.get()));
        } else {
            return new HashSet<>();
        }
    }

    public void buy() {
        Optional<NewOrder> cart = orderRepository.findByUser_UserNameAndFinishedIsFalse(userSessionProvider.getLoggedUser().getUsername());
        NewOrder newOrder = cart.get();
        newOrder.setFinished(true);
        orderRepository.save(newOrder);
    }

    public void delete(int itemId) {
        OrderItem one = orderItemRepository.getOne(itemId);
        Optional<Drink> byId = drinkRepository.findById(one.getDrink().getId());
        int availability = byId.get().getAvailability();
        byId.get().setAvailability(availability + one.getAmount());
        orderItemRepository.deleteById(itemId);
        drinkRepository.save(byId.get());
    }


    public String math230V(double numb) {
        double sum = numb/230;
        String str = Double.toString(sum);
      return str;

    }

    public String math460V(double numb460) {
        double sum = numb460/(1.73*400);
        String str2 = Double.toString(sum);
        return str2;
    }

    public String lowVoltage(double In, double l, double o, double Un, double s) {
        double lowVoltage = (2*In*l)/(o*Un*s);
        String str1 = Double.toString(lowVoltage);
        return str1;
    }
}