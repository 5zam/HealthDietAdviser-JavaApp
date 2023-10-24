package com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces;

import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;

import java.util.List;

public interface DietPrescriptionInterface {
    void addDietPrescription(DietPrescription category);

    List<DietPrescription> showAllDietPrescription();
}
