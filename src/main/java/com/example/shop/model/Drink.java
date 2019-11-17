package com.example.shop.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Drink  {
    @Id
    @GeneratedValue(generator = "drinkSeq")
    @SequenceGenerator(name = "drinkSeq", sequenceName = "drink_seq", allocationSize = 1)
   private int id;
   private int typeId;
   private String name;
   private int volume;
   private double price;
    private int availability;
    private String picture;


    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }


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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return id == drink.id &&
                typeId == drink.typeId &&
                volume == drink.volume &&
                Double.compare(drink.price, price) == 0 &&
                Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}