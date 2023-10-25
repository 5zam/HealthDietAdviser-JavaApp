package com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation;

import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.MealRepository;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces.MealInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MealImplementation implements MealInterface {


    @Autowired
    private MealRepository mealRepository;

    @Override
    public void addMeal(Meal meal) {
        mealRepository.save(meal);
    }

    @Override
    public List<Meal> showAllMeals() {
        return mealRepository.findAll();
    }

    @Override
    public List<Meal> addAllMeals(List<Meal> meals) {
        if(meals != null && !meals.isEmpty()) {
            return mealRepository.saveAll(meals);
        }
        return Collections.emptyList();
    }
}


