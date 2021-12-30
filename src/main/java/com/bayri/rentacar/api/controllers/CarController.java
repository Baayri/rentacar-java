package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.CarService;
import com.bayri.rentacar.entities.concretes.Car;
import com.bayri.rentacar.entities.dtos.CarDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        super();
        this.carService = carService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Car car){
        this.carService.add(car);
    }

    @GetMapping("/getAll")
    public List<Car> getAll(){
        return this.carService.getAll();
    }

    @GetMapping("getById")
    public Car getById(int id){
       return this.carService.getById(id);
    }

    @GetMapping("/getAllDto")
    public List<CarDetailsDto> getAllDto(){
        return this.carService.getAllDto();
    }

    @GetMapping("/getDto")
    public CarDetailsDto getDto(@RequestParam int id){
        return this.carService.getDto(id);
    }

    @GetMapping("/getByBrandIdAndColorId")
    public List<Car> getByBrand_IdAndColor_Id(@RequestParam int brandId, int colorId){
        return this.carService.getByBrand_IdAndColor_Id(brandId,colorId);
    }

    @GetMapping("/getByCarLocationId")
    public List<Car> getByCarLocation_Id(int id){
        return this.carService.getByCarLocation_Id(id);
    }

    @GetMapping("/getLocationDto")
    public CarDetailsDto getLocationDto(int id){
        return this.carService.getLocationDto(id);
    }
}
