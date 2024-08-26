package com.ABC.back_end.model;

import com.ABC.back_end.dto.RestaurantDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//Creating User table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //Creating columns of user table
    //Primary key (Auto generate)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    private String password;

    private USER_ROLE role;

    @JsonIgnore //When getting the user table, this column does not need everytime
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer") // A user can have many orders (Relationship between User table and Order table)
    private List<Order> orders = new ArrayList<>();

    @ElementCollection
    private List<RestaurantDto> favourites = new ArrayList();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) //A user can have many addresses (Relationship between User table and Address table)
    //When deleting a user, All the addresses that connected to that user will be deleted (cascade)
    private List<Address> addresses = new ArrayList<>();

}
