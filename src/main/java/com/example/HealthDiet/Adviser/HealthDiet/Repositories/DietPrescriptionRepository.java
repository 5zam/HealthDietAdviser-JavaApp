package com.example.HealthDiet.Adviser.HealthDiet.Repositories;

import com.example.HealthDiet.Adviser.HealthDiet.Models.ChronicDisease;
import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DietPrescriptionRepository extends JpaRepository<DietPrescription,Long> {
    List<Meal> findByChronicDisease(ChronicDisease chronicDisease);

    //List<DietPrescription> findAllWithAssociations();
    @Query("SELECT dp FROM DietPrescription dp LEFT JOIN FETCH dp.meal LEFT JOIN FETCH dp.chronicDisease")
    List<DietPrescription> findAllWithAssociations();

}
