package com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation;

import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.DietPrescriptionRepository;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces.DietPrescriptionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DietPrescriptionImplementation implements DietPrescriptionInterface {

    @Autowired
    private DietPrescriptionRepository dietPrescriptionRepository;

    @Override
    public void addDietPrescription(DietPrescription dietPrescription) {
        dietPrescriptionRepository.save(dietPrescription);
    }

    @Override
    public List<DietPrescription> showAllDietPrescription() {
        return dietPrescriptionRepository.findAll();
    }

    @Override
    public String updateDietPrescription(Long id, DietPrescription dietPrescription) {
        Optional<DietPrescription> PrescriptionFound = dietPrescriptionRepository.findById(id);
        if (PrescriptionFound.isPresent()) {
            dietPrescription.setMealAmount(dietPrescription.getMealAmount());
            dietPrescription.setMeal(dietPrescription.getMeal());
            dietPrescription.setChronicDisease(dietPrescription.getChronicDisease());
            dietPrescriptionRepository.save(dietPrescription);
            return "diet Prescription Updated";
        }
        else {
            return " Sorry, Not Found";
        }
    }
}
