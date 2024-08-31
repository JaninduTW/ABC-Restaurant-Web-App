package com.ABC.back_end.model;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private Long price;

    @ManyToOne //Many foods can be on the same category (Relationship between Food table and Category table)
    private Category foodCategory;

    @Column(length = 1000)
    @ElementCollection
    private List<String> images;

    private boolean available;

    @ManyToOne //One restaurant can have many foods (Relationship between Food table and Restaurant table)
    private Restaurant restaurant;

    private boolean isVegetarian;

    private boolean isSeasonal;

    @ManyToMany ////Many food can have many Ingredients (Relationship between Food table and IngredientsItem table)
    private List <IngredientsItem> ingredients = new ArrayList<>();


    private Date CreationDate;

}
