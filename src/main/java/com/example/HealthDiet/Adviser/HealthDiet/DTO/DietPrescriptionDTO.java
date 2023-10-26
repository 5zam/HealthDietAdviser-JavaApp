package com.example.HealthDiet.Adviser.HealthDiet.DTO;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class  DietPrescriptionDTO{
    private Long mealId;
    private Long chronicDiseaseId;
    private String mealAmount;


}
