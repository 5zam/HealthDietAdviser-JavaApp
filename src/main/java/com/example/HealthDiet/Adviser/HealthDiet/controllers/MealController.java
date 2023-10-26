package com.example.HealthDiet.Adviser.HealthDiet.controllers;

import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation.MealImplementation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MealController {

    @Autowired
    private MealImplementation mealImplementation;

    /**
     ** addManyMeals, add meal , show meal:
    */
//    @PostMapping("/addManyMeals")
//    public ResponseEntity<String> addAll(@RequestBody List<Meal> meals) {
//        try {
//            List<Meal> addedMeals = mealImplementation.addAllMeals(meals);
//            String message = addedMeals.size() + " meals added successfully!";
//            return ResponseEntity.status(HttpStatus.OK).body(message);
//        } catch (Exception e) {
//            String errorMessage = "Error adding meals: " + e.getMessage();
//           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
//        }
//    }


//   @PostMapping("/addMeal")
//    public ResponseEntity<String> addMeal(@RequestBody @Valid Meal meal) {
//        try {
//            mealImplementation.addMeal(meal);
//            String message = "Meal added successfully!";
//
//            // Return the response status and the message in the body
//            return ResponseEntity.status(HttpStatus.OK).body(message);
//        }
//        catch (Exception e) {
//            // Saving the error message in a variable and using getMessage method
//            // to get detailed error message from the Exception class
//            String errorMessage = "Error adding meal: " + e.getMessage();
//            // Return the response status and the error message in the body
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
//        }
//    }


//    @GetMapping("/showMeals")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Meal> showAllMeals(){
//        return mealImplementation.showAllMeals();
//    }


//    @GetMapping("/byDiseaseName/{diseaseName}")
//    public ResponseEntity<List<Meal>> getMealsByDiseaseName(@PathVariable String diseaseName) {
//        List<Meal> meals = mealImplementation.getMealsByDiseaseName(diseaseName);
//        return ResponseEntity.ok(meals);
//    }

}
