package com.example.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class DrinkType {
    @Id
    @GeneratedValue(generator = "drinkTypeSeq")
    @SequenceGenerator(name = "drinkTypeSeq", sequenceName = "drinkType_seq", allocationSize = 1)
   private int id;
   private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
