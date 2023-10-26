package com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation;

import com.example.HealthDiet.Adviser.HealthDiet.DTO.DietPrescriptionDTO;
import com.example.HealthDiet.Adviser.HealthDiet.Models.ChronicDisease;
import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.ChronicDiseaseRepository;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.DietPrescriptionRepository;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.MealRepository;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces.DietPrescriptionInterface;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class DietPrescriptionImplementation implements DietPrescriptionInterface {


    @Autowired
    private DietPrescriptionRepository dietPrescriptionRepository;

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private ChronicDiseaseRepository chronicDiseaseRepository;


  //  @Override
//    public void addDietPrescriptions(DietPrescriptionDTO dietPrescriptionDTO) {
//        Meal meal = mealRepository.findById(dietPrescriptionDTO.getMealId())
//                .orElseThrow(() -> new EntityNotFoundException("Meal not found with id: "
//                        + dietPrescriptionDTO.getMealId()));
//
//        ChronicDisease chronicDisease = chronicDiseaseRepository.findById(dietPrescriptionDTO.getChronicDiseaseId())
//                .orElseThrow(() -> new EntityNotFoundException("Chronic Disease not found with id: "
//                        + dietPrescriptionDTO.getChronicDiseaseId()));
//
//        DietPrescription dietPrescription = new DietPrescription();
//        dietPrescription.setMeal(meal);
//        dietPrescription.setChronicDisease(chronicDisease);
//        dietPrescription.setMealAmount(dietPrescriptionDTO.getMealAmount());
//
//        dietPrescriptionRepository.save(dietPrescription);
//    }

//    @Override
//    public List<DietPrescription> showAllDietPrescription() {
//        return dietPrescriptionRepository.findAll();
//    }




//    @Override
//    public String updateDietPrescription(Long id, DietPrescription dietPrescription) {
//        Optional<DietPrescription> prescriptionFound = dietPrescriptionRepository.findById(id);
//        if (prescriptionFound.isPresent()) {
//            DietPrescription existingPrescription = prescriptionFound.get();
//
//            // Update the fields
//            existingPrescription.setMealAmount(dietPrescription.getMealAmount());
//
//            // Check if meal and chronicDisease are not null in the request
//            if (dietPrescription.getMeal() != null) {
//                existingPrescription.setMeal(dietPrescription.getMeal());
//            }
//
//            if (dietPrescription.getChronicDisease() != null) {
//                existingPrescription.setChronicDisease(dietPrescription.getChronicDisease());
//            }
//
//            // Save the existing prescription, not the incoming one
//            dietPrescriptionRepository.save(existingPrescription);
//            return "Diet Prescription Updated";
//        } else {
//            return "Diet Prescription with ID " + id + " Not Found"; // Return a specific message
//        }
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
//        return dietPrescriptionRepository.findByChronicDisease(chronicDisease);
//    }

}

