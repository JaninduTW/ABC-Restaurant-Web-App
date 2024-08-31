package com.ABC.back_end.model;

import jakarta.persistence.*;
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

    @ManyToOne //Many order items can have same food (Relationship between Orderitem table and Food table)
    private Food food;

    private int quantity;

    private Long totalPrice;

    //private List<String> ingredients;
}
