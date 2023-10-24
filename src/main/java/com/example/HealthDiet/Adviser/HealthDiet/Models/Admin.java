package com.example.HealthDiet.Adviser.HealthDiet.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

/*
 * Here we have the child class - admin
 */

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Admin extends Person{
    //Admin attributes:
    //private String adminAdditionalField; never use

    //yes admin can add categories but now no need to implement it.
//    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
//    private List<Category> categories;

}
