package com.example.HealthDiet.Adviser.HealthDiet.Models;


/*
 * admin add food to specific category
 */

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
@Table(name = "tbl_Meal")

public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mealId;

    private String mealName;

    @OneToMany(mappedBy = "meal",fetch = FetchType.EAGER)
    private List<DietPrescription> dietPrescriptions;

    ////////////////////////////////////backup1/////////////////
    //all attributes in Meal table
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long mealId;
//
//    private String mealName;
//
//    @ManyToOne
//    @JoinColumn(name = "diet_prescription_id")
//    private DietPrescription dietPrescription;

//    @ManyToOne
//    @JoinColumn(name = "chronic_disease_id")
//    private ChronicDisease chronicDisease;
}
