package com.example.shop.session;

import com.example.shop.model.Drink;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class CartSession {
    private List<Drink> sessionDrinks = new ArrayList<>();
    public void addDrinkToCart(Drink drink){
        sessionDrinks.add(drink);
    }
}
