package com.example.shop.service;

import com.example.shop.repository.ShopRepository;

public class OrderService {
    private final ShopRepository shopRepostory;

    public OrderService(ShopRepository shopRepository){
        this.shopRepostory = shopRepository;
    }
}
