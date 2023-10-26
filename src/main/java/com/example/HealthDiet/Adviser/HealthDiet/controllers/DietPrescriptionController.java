package com.example.HealthDiet.Adviser.HealthDiet.controllers;


import com.example.HealthDiet.Adviser.HealthDiet.DTO.DietPrescriptionDTO;
import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation.DietPrescriptionImplementation;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/DietPrescription")
public class DietPrescriptionController {

    @Autowired
    private DietPrescriptionImplementation dietPrescriptionImplementation;


    ///////////****************/////////////////
//    @PostMapping("/add")
//    public ResponseEntity<String> addDietPrescription(@RequestBody @Valid DietPrescriptionDTO dietPrescriptionDTO) {
//        try {
//            dietPrescriptionImplementation.addDietPrescriptions(dietPrescriptionDTO);
//            String messsage = "Diet Prescription added successfully!";
//            return ResponseEntity.status(HttpStatus.OK).body(messsage);
//        } catch (Exception e) {
//            String errorMessage = "Error adding course: " + e.getMessage();
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
//        }
//    }
//
//    @GetMapping("/show")
//    @ResponseStatus(HttpStatus.OK)
//    public List<DietPrescription> showAllDietPrescriptions(){
//        return dietPrescriptionImplementation.showAllDietPrescription();
//    }
    ///////////////*************/////////////////


//    @PutMapping("/update/{id}")
//    public String updateDietPrescription(@PathVariable Long id, @RequestBody DietPrescription dietPrescription) {
//        return dietPrescriptionImplementation.updateDietPrescription(id, dietPrescription);
//    }

    @GetMapping("/testShow")
    public ResponseEntity<String> testShow() {
        return ResponseEntity.ok("Test show endpoint is working!");
    }


//    @GetMapping("/byDiseaseName/{diseaseName}")
//    public ResponseEntity<List<Meal>> getMealsByDiseaseName(@PathVariable String diseaseName) {
//        List<Meal> meals = dietPrescriptionImplementation.getMealsByDiseaseName(diseaseName);
//        return ResponseEntity.ok(meals);
//    }

}


