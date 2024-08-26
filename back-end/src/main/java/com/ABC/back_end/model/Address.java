package com.ABC.back_end.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

    //Creating columns of Address table
    //Primary key (Auto generate)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

}
