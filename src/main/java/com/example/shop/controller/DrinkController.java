package com.example.shop.controller;

import com.example.shop.model.Drink;
import com.example.shop.model.OrderItem;
import com.example.shop.service.OrderService;
import com.example.shop.session.UserSessionProvider;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.Set;

@RestController
public class DrinkController {
    private final OrderService orderService;
    private final UserSessionProvider userSessionProvider;

    public DrinkController(OrderService orderService, UserSessionProvider userSessionProvider) {
        this.orderService = orderService;
        this.userSessionProvider = userSessionProvider;
    }

    @GetMapping("/")
    public ModelAndView searchDrinkView() {
        Set<Drink> drinks = orderService.findAllDrink();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("drinks", drinks);
        return modelAndView;
    }

    @GetMapping("/drinks")
    public ModelAndView searchDrink(@RequestParam(required = true) String drinkName) {
        Set<Drink> drink = orderService.findDrinkByName(drinkName);
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("drink", drink);
        return modelAndView;
    }

    @GetMapping("/addtocart")
    public ModelAndView basketProduct(@RequestParam(required = false) int id, @RequestParam(required = false) int availability) {
        Optional<Drink> byId = orderService.findById(id);
        if (byId.isPresent()) {
            Drink drink = byId.get();
            if (drink.getAvailability() >= availability) {
                drink.setAvailability(drink.getAvailability() - availability);
                orderService.order(drink, availability);
            }
        }
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject(byId);
        modelAndView.addObject("drinks", orderService.findAllDrink());
        return modelAndView;
    }

    @GetMapping("/cart")
    public ModelAndView cart() {
        ModelAndView modelAndView = new ModelAndView("cart");
        Set<OrderItem> itemsInCart = orderService.printCart();
        modelAndView.addObject("itemsInCart", itemsInCart);
        return modelAndView;
    }

    @GetMapping("/buy")
    public ModelAndView buy() {
        orderService.buy();
        Set<Drink> drinks = orderService.findAllDrink();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("drinks", drinks);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id")int itemId) {
        ModelAndView modelAndView = new ModelAndView("cart");

        orderService.delete(itemId);
        Set<OrderItem> itemsInCart = orderService.printCart();
        modelAndView.addObject("itemsInCart", itemsInCart);
        return modelAndView;
    }
}

