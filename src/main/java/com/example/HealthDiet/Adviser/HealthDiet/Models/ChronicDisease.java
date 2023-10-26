package com.example.HealthDiet.Adviser.HealthDiet.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_chronic_diseases")
public class ChronicDisease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diseaseId;

    @Column(name = "diseaseName")
    private String diseaseName;

    @OneToMany(mappedBy = "chronicDisease")
    private List<DietPrescription> dietPrescriptions;

    ////////////////////////////////////////backup1////////////////
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long diseaseId;
//
//
//    @Column(name = "diseaseName")
//    private String diseaseName;
//
//
//    @OneToMany(mappedBy = "chronicDisease")
//    private List<DietPrescription> dietPrescriptions;
}
