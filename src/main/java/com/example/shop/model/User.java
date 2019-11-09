package com.example.shop.model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Entity;


@Entity
public class User {
    @Id
    private String user;
    private String password;
    @ManyToOne(targetEntity = Role.class)
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}