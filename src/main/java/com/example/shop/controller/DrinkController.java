package com.example.shop.controller;

import com.example.shop.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrinkController {
    private final OrderService orderService;

    public DrinkController(OrderService orderService) {
        this.orderService = orderService;
    }
}
