package com.ABC.back_end.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Restaurant {

    //Primary key by @ID (Auto generate)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    private User owner;

}
