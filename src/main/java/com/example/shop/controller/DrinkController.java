package com.example.shop.controller;

import com.example.shop.model.Drink;
import com.example.shop.service.OrderService;
import com.example.shop.session.CartSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.Set;

@RestController
public class DrinkController {
    private final OrderService orderService;
    private final CartSession cartSession;

    public DrinkController(OrderService orderService, CartSession cartSession) {
        this.orderService = orderService;
        this.cartSession = cartSession;
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

    @GetMapping("/cart")
    public ModelAndView basketProduct(@RequestParam(required = false) int id, @RequestParam(required = false) int availability) {
        Optional<Drink> byId = orderService.findById(id);
        if (byId.isPresent()) {
            Drink drink = byId.get();
            drink.setAvailability(drink.getAvailability() - availability);
            orderService.save(drink);
        }
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("drinks", orderService.findAllDrink());
        return modelAndView;

    }
}
