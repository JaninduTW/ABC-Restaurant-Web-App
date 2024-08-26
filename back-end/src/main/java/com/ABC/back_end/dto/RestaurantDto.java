package com.ABC.back_end.dto;


import jakarta.persistence.Column;
import lombok.Data;

import java.util.List;

@Data
public class RestaurantDto {

    private Long id;

    private String title;

    @Column(length = 1000) //Increase column size
    private List<String> images;

    private String description;


}
