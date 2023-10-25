package com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces;

import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;

import java.util.List;

public interface MealInterface {
    void addMeal(Meal meal);

    List<Meal> showAllMeals();

    List<Meal> addAllMeals(List<Meal> meals);
}
