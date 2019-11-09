package com.example.shop.controller;

import com.example.shop.model.Drink;
import com.example.shop.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class DrinkController {
    private final OrderService orderService;

    public DrinkController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public ModelAndView searchDrinkView() {
        return new ModelAndView("home");
    }

    @GetMapping("/drinks")
    public ModelAndView searchDrink(@RequestParam(required = false) String drinkName) {
        List<Drink> drinks = orderService.findDrinkByName(drinkName);
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("drinks", drinks);
        return modelAndView;
    }
}
