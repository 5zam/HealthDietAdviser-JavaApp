package com.example.HealthDiet.Adviser.HealthDiet.controllers;


import com.example.HealthDiet.Adviser.HealthDiet.Models.Category;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation.CategoryImplementation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories") //all categories requests should start with /categories
public class CategoryController {

    @Autowired
    private CategoryImplementation categoryImplementation;

    // Endpoint to add a new food category
    // Endpoint for adding a category without admin authorization
    @PostMapping("/addCategory")
    public ResponseEntity<String> addCategory(@RequestBody @Valid Category category) {
        try {
            categoryImplementation.addCategory(category);
            String message = "Category added successfully!";

            // Return the response status and the message in the body
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }
         catch (Exception e) {
            // Saving the error message in a variable and using getMessage method
            // to get detailed error message from the Exception class
            String errorMessage = "Error adding category: " + e.getMessage();
            // Return the response status and the error message in the body
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }

    // get all categories
    @GetMapping("/show")
    @ResponseStatus(HttpStatus.OK)
    public List<Category> showAllCategories(){
        return categoryImplementation.showAllCategories();
    }

    //add many categories in sametime

}


