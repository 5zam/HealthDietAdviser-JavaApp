package com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation;

import com.example.HealthDiet.Adviser.HealthDiet.Models.ChronicDisease;
import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.ChronicDiseaseRepository;
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


    @Autowired
    private  ChronicDiseaseRepository chronicDiseaseRepository;

//    @Autowired
//    public MealImplementation(MealRepository mealRepository, ChronicDiseaseRepository chronicDiseaseRepository) {
//        this.mealRepository = mealRepository;
//        this.chronicDiseaseRepository = chronicDiseaseRepository;
//    }

//    @Override
//    public void addMeal(Meal meal) {
//        mealRepository.save(meal);
//    }


//    @Override
//    public List<Meal> showAllMeals() {
//        return mealRepository.findAll();
//    }


//    @Override
//    public List<Meal> addAllMeals(List<Meal> meals) {
//        if(meals != null && !meals.isEmpty()) {
//            return mealRepository.saveAll(meals);
//        }
//        return Collections.emptyList();
//    }

//    @Override
//    public List<Meal> getMealsByDiseaseName(String diseaseName) {
//        ChronicDisease chronicDisease = chronicDiseaseRepository.findByDiseaseName(diseaseName);
//
//        if (chronicDisease == null) {
//            // Handle the case where the disease name doesn't exist
//            return Collections.emptyList(); // You can return an empty list or handle it differently
//        }
//
//        return mealRepository.findByChronicDisease(chronicDisease);
//    }

}



