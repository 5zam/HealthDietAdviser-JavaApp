package com.example.HealthDiet.Adviser.HealthDiet.Models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
//@RequiredArgsConstructor
@Data
@Entity
@Table(name = "tbl_Diet_Prescription")
public class DietPrescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chronic_disease_id")
    private ChronicDisease chronicDisease;

    private String mealAmount;


    ///////////////////backup1/////////////
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
////    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
////    @JoinColumn(name = "meal_id")
////    private Meal meal;
////
////    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
////    @JoinColumn(name = "chronic_disease_id")
////    private ChronicDisease chronicDisease;
//
//    @NotNull
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "meal_id")
//    private Meal meal;
//
//    @NotNull
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "chronic_disease_id")
//    private ChronicDisease chronicDisease;
//
//    private String mealAmount;
}
