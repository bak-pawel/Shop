package com.example.shop.repository;

import com.example.shop.model.MathMy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MathRepository extends JpaRepository<MathMy, Integer> {
}
