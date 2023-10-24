package com.example.HealthDiet.Adviser.HealthDiet.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/*
 * related Category
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_category")
public class Category {

    //all attributes in category table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String CategoryName;

    //admin can add more than one category- no need to add now
//    @ManyToOne
//    @JoinColumn(name = "admin_id")
//    private Admin admin;

    //each category has many food items
    // Relationships
    @OneToMany(mappedBy = "category")
    private List<Meal> meals;

}
