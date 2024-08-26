package com.ABC.back_end.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    //Primary key by @ID (Auto generate)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne // Many orders can be created by one customer (Relationship between Order table and User table)
    private User customer;

    @JsonIgnore //When getting the user table, this column does not need everytime
    @ManyToOne //A restaurant can have many orders (Relationship between Restaurant table and Order table)
    private  Restaurant restaurant;

    private Long totalAmount;

    private String orderStatus;

    private Data createdAt;

    @ManyToOne //An address can have many orders, Multiple orders for same address (Relationship between Address table and Order table)
    private String deliveryAddress;

    @OneToMany
    private List<Orderitem> items;

    //private Payment payment;

    private int totalItem;

    private int totalPrice;

}
