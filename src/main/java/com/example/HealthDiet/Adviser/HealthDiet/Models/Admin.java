package com.example.HealthDiet.Adviser.HealthDiet.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/*
 * Here we have the child class - admin
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_admin")
public class Admin extends Person{
    //Admin attributes:
    @Id
    private long id;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Category> categories;

}
