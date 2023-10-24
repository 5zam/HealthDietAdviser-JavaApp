package com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces;

import com.example.HealthDiet.Adviser.HealthDiet.Models.Category;

import java.util.List;

public interface CategoryInterface {
    void addCategory(Category category);

    List<Category> showAllCategories();
}
