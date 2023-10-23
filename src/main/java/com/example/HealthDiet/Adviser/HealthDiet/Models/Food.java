package com.example.HealthDiet.Adviser.HealthDiet.Models;


/*
 * admin add food to specific category
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_admin")
public class Food {

    //all attributes in food table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    //each food has to be in specific category
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
