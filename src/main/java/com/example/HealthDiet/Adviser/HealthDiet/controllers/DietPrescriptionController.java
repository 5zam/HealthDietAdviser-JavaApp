package com.example.HealthDiet.Adviser.HealthDiet.controllers;


import com.example.HealthDiet.Adviser.HealthDiet.Models.DietPrescription;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation.DietPrescriptionImplementation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DietPrescriptions") //all DietPrescription requests should start with /DietPrescriptions
public class DietPrescriptionController {

    @Autowired
    private DietPrescriptionImplementation dietPrescriptionImplementation;

    // Endpoint to add a new DietPrescription
    // Endpoint for adding a DietPrescription without admin authorization
    @PostMapping("/addDietPrescription")
    public ResponseEntity<String> addDietPrescription(@RequestBody @Valid DietPrescription dietPrescription) {
        try {
            dietPrescriptionImplementation.addDietPrescription(dietPrescription);
            String message = "Diet Prescription added successfully!";

            // Return the response status and the message in the body
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }
         catch (Exception e) {
            // Saving the error message in a variable and using getMessage method
            // to get detailed error message from the Exception class
            String errorMessage = "Error adding Diet Prescriptions: " + e.getMessage();
            // Return the response status and the error message in the body
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }

    // get all categories
    @GetMapping("/show")
    @ResponseStatus(HttpStatus.OK)
    public List<DietPrescription> showAllDietPrescriptions(){
        return dietPrescriptionImplementation.showAllDietPrescription();
    }

    @PutMapping("/update/{id}")
    public String updateDietPrescription(@PathVariable Long id, @RequestBody DietPrescription dietPrescription) {
        return dietPrescriptionImplementation.updateDietPrescription(id, dietPrescription);
    }


    //add many categories in sametime

}


