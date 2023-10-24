package com.example.HealthDiet.Adviser.HealthDiet.Repositories;


import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Meal, Long> {
}
