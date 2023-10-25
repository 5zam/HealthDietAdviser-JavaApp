package com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation;

import com.example.HealthDiet.Adviser.HealthDiet.Models.ChronicDisease;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.ChronicDiseaseRepository;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces.diseaseInterface;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class diseaseImplementation implements diseaseInterface {

 @Autowired
    private ChronicDiseaseRepository chronicDiseaseRepository;

    @Override
    public void addDisease(ChronicDisease chronicDisease) {
        chronicDiseaseRepository.save(chronicDisease);
    }

    @Override
    public List<ChronicDisease> showAllChronicDisease() {
        return chronicDiseaseRepository.findAll();
    }

    @Override
    public void deleteDiseases(Long diseaseId) {
        Optional<ChronicDisease> existingDisease = chronicDiseaseRepository.findById(diseaseId);
        if (existingDisease.isPresent()) {
            chronicDiseaseRepository.deleteById(diseaseId);
        } else {
            throw new EntityNotFoundException("Disease with ID " + diseaseId + " not found");
    }
    }
    @Override
    public String removeDisease(String diseaseName) {
        try {
            if (chronicDiseaseRepository.existsByDiseaseName(diseaseName)) {
                chronicDiseaseRepository.deleteByDiseaseName(diseaseName);
                return "Deleted";
            } else {
                return "not found!";
            }
        } catch (Exception e) {
            // Handle unexpected exceptions here
            return "An error occurred: " + e.getMessage();
        }
    }


}
