package com.bayri.rentacar.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @Column(name = "model_year")
    private String modelYear;

    @Column(name = "daily_price")
    private int dailyPrice;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "car")
    private List<Rental> rentals;

    @JsonIgnore
    @OneToMany(mappedBy = "car")
    private List<CarImage> carImages;
}
