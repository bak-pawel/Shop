package com.example.shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Drink  {
    @Id
    @GeneratedValue(generator = "roleSeq")
    @SequenceGenerator(name = "roleSeq", sequenceName = "role_seq", allocationSize = 1)
    int id;
    int typeId;
    String name;
    int volume;
    double price;
    int quantity;


    @ManyToOne
    private DrinkType drinkType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return id == drink.id &&
                typeId == drink.typeId &&
                volume == drink.volume &&
                Double.compare(drink.price, price) == 0 &&
                quantity == drink.quantity &&
                Objects.equals(name, drink.name) &&
                Objects.equals(drinkType, drink.drinkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeId, name, volume, price, quantity, drinkType);
    }

    public Drink() {}

    public Drink(int typeId, String name, int volume, double price) {
        this.typeId = typeId;
        this.name = name;
        this.volume = volume;
        this.price = price;
    }
}
