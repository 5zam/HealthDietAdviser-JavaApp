package com.example.HealthDiet.Adviser.HealthDiet.Repositories;

import com.example.HealthDiet.Adviser.HealthDiet.Models.ChronicDisease;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
//    List<Meal> findByChronicDisease(ChronicDisease chronicDisease);
}
