package com.example.shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(generator = "orderItemSeq")
    @SequenceGenerator(name = "orderItemSeq", sequenceName = "orderItem_Seq", allocationSize = 1)
    private int id;
    @ManyToOne
    private NewOrder newOrder;
    @ManyToOne
    private Item item;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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
                Objects.equals(item, item.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, newOrder, item, amount);
    }

    public OrderItem(NewOrder newOrder, Item item, int amount) {
        this.newOrder = newOrder;
        this.item = item;
        this.amount = amount;
    }

}
