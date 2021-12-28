package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.ColorService;
import com.bayri.rentacar.entities.concretes.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
@CrossOrigin
public class ColorController {
    private final ColorService colorService;

    @Autowired
    public ColorController(ColorService colorService) {
        super();
        this.colorService = colorService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Color color){
        this.colorService.add(color);
    }

    @GetMapping("/getAll")
    public List<Color> getAll(){
        return this.colorService.getAll();
    }
}
