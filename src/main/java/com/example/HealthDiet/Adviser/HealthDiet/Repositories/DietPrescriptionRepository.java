package com.example.HealthDiet.Adviser.HealthDiet.Repositories;

import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DietPrescriptionRepository extends JpaRepository<DietPrescription,Long> {
}
