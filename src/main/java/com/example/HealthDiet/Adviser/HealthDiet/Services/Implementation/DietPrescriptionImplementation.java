package com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation;

import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.DietPrescriptionRepository;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces.DietPrescriptionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
