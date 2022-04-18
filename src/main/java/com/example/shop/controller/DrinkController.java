package com.example.shop.controller;

import com.example.shop.model.Drink;
import com.example.shop.model.OrderItem;
import com.example.shop.service.OrderService;
import com.example.shop.session.UserSessionProvider;
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
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
    @GetMapping("/store")
    public ModelAndView searchDrinkView() {
        Set<Drink> drinks = orderService.findAllDrink();
        ModelAndView modelAndView = new ModelAndView("store");
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
    @GetMapping("/braker")
    public ModelAndView braker(@RequestParam(defaultValue = "0", required = false) double numb,@RequestParam(defaultValue = "0", required = false) double numb460) {
        String brake = orderService.math230V(numb);
        String brake460 = orderService.math460V(numb460);
        ModelAndView modelAndView = new ModelAndView("braker");
        modelAndView.addObject("brake",brake);
        modelAndView.addObject("brake460",brake460);
        return modelAndView;
    }
    @GetMapping("/lowVoltage")
    public ModelAndView lowVoltage(
            @RequestParam(defaultValue = "0", required = false) double In,
            @RequestParam(defaultValue = "0", required = false) double l,
            @RequestParam(defaultValue = "0", required = false) double o,
            @RequestParam(defaultValue = "0", required = false) double Un,
            @RequestParam(defaultValue = "0", required = false) double s) {
        String lowVoltage = orderService.lowVoltage(In,l,o,Un,s);
        ModelAndView modelAndView = new ModelAndView("lowVoltage");
        modelAndView.addObject("lowVoltage",lowVoltage);
        return modelAndView;
    }
    @GetMapping("/contact")
    public ModelAndView contact() {
        ModelAndView modelAndView = new ModelAndView("contact");
        return modelAndView;
    }
}