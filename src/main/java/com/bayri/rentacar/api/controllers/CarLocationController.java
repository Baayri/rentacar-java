package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.CarLocationService;
import com.bayri.rentacar.entities.concretes.CarLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carLocations")
@CrossOrigin
public class CarLocationController {
    private final CarLocationService carLocationService;

    @Autowired
    public CarLocationController(CarLocationService carLocationService) {
        super();
        this.carLocationService = carLocationService;
    }

    @PostMapping("/add")
    public void add(@RequestBody CarLocation carLocation){
        this.carLocationService.add(carLocation);
    }

    @GetMapping("/getAll")
    public List<CarLocation> getAll(){
        return this.carLocationService.getAll();
    }
}
