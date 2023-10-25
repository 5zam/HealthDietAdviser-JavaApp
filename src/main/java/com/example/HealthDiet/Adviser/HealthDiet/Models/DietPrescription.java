package com.example.HealthDiet.Adviser.HealthDiet.Models;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tbl_Diet_Prescription")
public class DietPrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @ManyToOne
    @JoinColumn(name = "chronic_disease_id")
    private ChronicDisease chronicDisease;

    private String mealAmount;
}
