package com.example.HealthDiet.Adviser.HealthDiet.controllers;

import com.example.HealthDiet.Adviser.HealthDiet.Models.ChronicDisease;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation.diseaseImplementation;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *Admin role here to manage disease by add or remove it
 **/
@RestController
public class DiseaseController {

    @Autowired
    private diseaseImplementation DiseaseImplementation;

    /**
     *Add new disease feature
     **/
//    @PostMapping("/addDisease")
//    public ResponseEntity<String> addDisease(@RequestBody @Valid ChronicDisease chronicDisease) {
//        try {
//            DiseaseImplementation.addDisease(chronicDisease);
//            String message = "new chronic Disease added successfully!";
//
//            // Return the response status and the message in the body
//            return ResponseEntity.status(HttpStatus.OK).body(message);
//        }
//        catch (Exception e) {
//            // Saving the error message in a variable and using getMessage method
//            // to get detailed error message from the Exception class
//            String errorMessage = "Error adding chronic Disease: " + e.getMessage();
//            // Return the response status and the error message in the body
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
//        }
//    }

    /**
    *Delete disease by id
    **/
//    @DeleteMapping("/Diseases/{diseaseId}")
//    public ResponseEntity<String> deleteDiseases(@PathVariable Long diseaseId) {
//        try {
//            DiseaseImplementation.deleteDiseases(diseaseId);
//            return ResponseEntity.ok("Deleted successfully");
//        } catch (Exception e) {
//            // Log the exception for debugging purposes
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("An error occurred while deleting the disease.");
//        }
//    }

    /**
     *Delete disease by disease name easily
     **/
//    @DeleteMapping("/delete/{diseaseName}")
//    public ResponseEntity<String> removeDisease(@PathVariable String diseaseName){
//        try {
//            DiseaseImplementation.removeDisease(diseaseName);
//            String message = "Deleted successfully!";
//            return ResponseEntity.ok(message);
//        }
//        catch (EntityNotFoundException ex) {
//            String errorMessage = "Error deleting: " + ex.getMessage();
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
//        }
//        catch (Exception e) {
//            String errorMessage = "Error deleting: " + e.getMessage();
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
//        }
//    }

    /**
     *List of diseases in the application
     **/
//    @GetMapping("/showChronicDisease")
//    @ResponseStatus(HttpStatus.OK)
//    public List<ChronicDisease> showAllChronicDisease(){
//        return DiseaseImplementation.showAllChronicDisease();
//    }
}
