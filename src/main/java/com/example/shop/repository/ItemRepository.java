package com.example.shop.repository;

import com.example.shop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ItemRepository extends JpaRepository <Item, Integer> {

    Set<Item> findItemByName(String itemName);
}
