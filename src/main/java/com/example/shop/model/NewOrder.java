package com.example.shop.model;

import javax.persistence.*;

@Entity
public class NewOrder {

    @Id
    @GeneratedValue(generator = "orderSeq")
    @SequenceGenerator(name = "orderSeq", sequenceName = "order_seq", allocationSize = 1)
    private int id;
   // @ManyToOne
   // private User user;

    private boolean finished;

}
