package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.CarImageService;
import com.bayri.rentacar.core.utilities.results.DataResult;
import com.bayri.rentacar.core.utilities.results.Result;
import com.bayri.rentacar.entities.concretes.CarImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/carImages")
@CrossOrigin
public class CarImageController {
    private final CarImageService carImageService;

    @Autowired
    public CarImageController(CarImageService carImageService) {
        super();
        this.carImageService = carImageService;
    }

    @PostMapping("/upload")
    public Result upload( int carId ,@RequestPart MultipartFile carImage){
        return this.carImageService.upload(carId,carImage);
    }

    @GetMapping("/getByCarId")
    public CarImage getByCar_Id(int id){
        return this.carImageService.getByCar_Id(id);
    }

    @GetMapping("/getAll")
    public DataResult<List<CarImage>> getAll(){
        return this.carImageService.getAll();
    }
}
