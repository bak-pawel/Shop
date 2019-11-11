package com.example.shop.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Entity;
import java.util.Collection;
import java.util.Collections;


@Entity
public class User implements UserDetails {
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

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void setUser(String user) { this.user = user; }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(String password) { return password; }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(role);
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return user;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}