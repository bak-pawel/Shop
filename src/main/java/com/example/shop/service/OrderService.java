package com.example.shop.service;

import com.example.shop.model.Item;
import com.example.shop.model.NewOrder;
import com.example.shop.model.OrderItem;
import com.example.shop.model.User;
import com.example.shop.repository.ItemRepository;
import com.example.shop.repository.MathRepository;
import com.example.shop.repository.OrderItemRepository;
import com.example.shop.repository.OrderRepository;
import com.example.shop.session.UserSessionProvider;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class OrderService {
    private final ItemRepository itemRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderRepository orderRepository;
    private final UserSessionProvider userSessionProvider;
    private final MathRepository mathRepository;


    public OrderService(ItemRepository itemRepository, OrderItemRepository orderItemRepository, OrderRepository orderRepository, UserSessionProvider userSessionProvider, MathRepository mathRepository) {
        this.itemRepository = itemRepository;
        this.orderItemRepository = orderItemRepository;
        this.orderRepository = orderRepository;
        this.userSessionProvider = userSessionProvider;
        this.mathRepository = mathRepository;
    }

    public Set<Item> findItemByName(String itemName) {
        if (itemName == null || itemName.equals("")) {

            return new HashSet<>(itemRepository.findAll());
        }
        return itemRepository.findItemByName(itemName);

    }

    public Set<Item> findAllItem() {
        return new HashSet<>(itemRepository.findAll());
    }

    public Optional<Item> findById(int id) {
        return itemRepository.findById(id);
    }

    public void order(Item item, int orderedAmount) {
        itemRepository.save(item); //sciagamy ze stanu
        //pobierz niezrealizowany order dla zalogowanego usera, jesli nie ma to stworz nowy
        User loggedUser = userSessionProvider.getLoggedUser();
        Optional<NewOrder> cart = orderRepository.findByUser_UserNameAndFinishedIsFalse(loggedUser.getUsername());
        if (cart.isPresent()) {
            Optional<OrderItem> byDrink_idAndNewOrder_id = orderItemRepository.findByItem_IdAndNewOrder_Id(item.getId(), cart.get().getId());
            if(byDrink_idAndNewOrder_id.isPresent()){
                OrderItem items = byDrink_idAndNewOrder_id.get();
                items.setAmount(items.getAmount()+orderedAmount);
                orderItemRepository.save(items);
            }else {
                OrderItem items = new OrderItem();//element w koszu
                items.setItem(item);
                items.setAmount(orderedAmount);
                items.setNewOrder(cart.get());
                orderItemRepository.save(items);
            }
        } else {
            NewOrder newOrder = new NewOrder(); // tworzymy nowe zamówienie
            newOrder.setUser(loggedUser); //ustawiamy usera dla tego zamówienia
            NewOrder savedOrder = orderRepository.save(newOrder); // zapisujemy ten koszyk dla usera
            OrderItem items = new OrderItem();//element w koszu
            items.setItem(item); // ustawiamy element zamówiony w koszyku
            items.setAmount(orderedAmount); //ustawiamy ilość któeą klient zamówił
            items.setNewOrder(savedOrder); // ustawiamy zamówienie z produktem
            orderItemRepository.save(items); // zapisujemy element zamówienia
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
        Optional<Item> byId = itemRepository.findById(one.getItem().getId());
        int availability = byId.get().getAvailability();
        byId.get().setAvailability(availability + one.getAmount());
        orderItemRepository.deleteById(itemId);
        itemRepository.save(byId.get());
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