package com.example.shop.model;

import javax.persistence.*;

@Entity
public class NewOrder {

    @Id
    @GeneratedValue(generator = "orderSeq")
    @SequenceGenerator(name = "orderSeq", sequenceName = "order_seq", allocationSize = 1)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isFinished() {
        return finished;
    }

    public boolean setFinished(boolean finished) {
        this.finished = finished;
        return true;
    }

    @ManyToOne
    private User user;

    private boolean finished;

    public NewOrder(User user) {
        this.user = user;
    }

    public NewOrder() {
    }
}
