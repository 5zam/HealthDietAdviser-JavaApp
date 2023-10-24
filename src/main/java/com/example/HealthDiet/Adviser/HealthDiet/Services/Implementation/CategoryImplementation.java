package com.example.HealthDiet.Adviser.HealthDiet.Services.Implementation;

import com.example.HealthDiet.Adviser.HealthDiet.Models.Category;
import com.example.HealthDiet.Adviser.HealthDiet.Repositories.CategoryRepository;
import com.example.HealthDiet.Adviser.HealthDiet.Services.Interfaces.CategoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImplementation implements CategoryInterface{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> showAllCategories() {
        return categoryRepository.findAll();
    }
}
