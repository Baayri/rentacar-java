package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.BrandService;
import com.bayri.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@CrossOrigin
public class BrandController {
    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        super();
        this.brandService = brandService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Brand brand){
        this.brandService.add(brand);
    }

    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return this.brandService.getAll();
    }
}
