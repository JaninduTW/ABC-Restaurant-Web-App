package com.ABC.back_end.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orderitem {

    //Creating columns of Orderitem table
    //Primary key by @ID (Auto generate)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



}
