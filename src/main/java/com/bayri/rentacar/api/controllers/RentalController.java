package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.RentalService;
import com.bayri.rentacar.entities.concretes.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")
@CrossOrigin
public class RentalController {
    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService) {
        super();
        this.rentalService = rentalService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Rental rental){
        this.rentalService.add(rental);
    }

    @GetMapping("getAll")
    public List<Rental> getAll() {
        return this.rentalService.getAll();
    }
}
