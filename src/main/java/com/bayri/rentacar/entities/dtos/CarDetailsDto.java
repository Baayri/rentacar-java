package com.bayri.rentacar.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDetailsDto {

    private int id;
    private String brandName;
    private String colorName;
    private String carLocation;
    private String modelYear;
    private int dailyPrice;
    private String description;
    private String image_url;
}
