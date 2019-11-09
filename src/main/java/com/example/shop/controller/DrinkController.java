package com.example.shop.controller;

import com.example.shop.model.Drink;
import com.example.shop.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Set;

@RestController
public class DrinkController {
    private final OrderService orderService;

    public DrinkController(OrderService orderService) {
        this.orderService = orderService;
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
    public ModelAndView basketProduct(){
        ModelAndView modelAndView = new ModelAndView("cart");
        return modelAndView;
    }


}
