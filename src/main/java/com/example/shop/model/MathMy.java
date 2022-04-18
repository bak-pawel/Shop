package com.example.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class MathMy {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private double sum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MathMy)) return false;
        MathMy mathMy = (MathMy) o;
        return Double.compare(mathMy.getSum(), getSum()) == 0 && getId().equals(mathMy.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSum());
    }
}
