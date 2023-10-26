package com.example.HealthDiet.Adviser.HealthDiet.Repositories;

import com.example.HealthDiet.Adviser.HealthDiet.Models.ChronicDisease;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ChronicDiseaseRepository extends JpaRepository<ChronicDisease, Long> {


    boolean existsByDiseaseName(String diseaseName);
    @Transactional
    @Modifying
    @Query("DELETE FROM ChronicDisease c WHERE c.diseaseName = :diseaseName")
    void deleteByDiseaseName(@Param("diseaseName") String diseaseName);

    ChronicDisease findByDiseaseName(String diseaseName);

}
