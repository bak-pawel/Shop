package com.example.shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class OrderItem {

    @Id
    private int id;
    @ManyToOne
    private NewOrder newOrder;
    @ManyToOne
    private Drink drink;
    private int amount;

    public OrderItem() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NewOrder getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(NewOrder newOrder) {
        this.newOrder = newOrder;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem item = (OrderItem) o;
        return id == item.id &&
                amount == item.amount &&
                Objects.equals(newOrder, item.newOrder) &&
                Objects.equals(drink, item.drink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, newOrder, drink, amount);
    }

    public OrderItem(NewOrder newOrder, Drink drink, int amount) {
        this.newOrder = newOrder;
        this.drink = drink;
        this.amount = amount;
    }

}
