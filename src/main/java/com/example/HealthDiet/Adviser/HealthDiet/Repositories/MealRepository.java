package com.example.HealthDiet.Adviser.HealthDiet.Repositories;

import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}
