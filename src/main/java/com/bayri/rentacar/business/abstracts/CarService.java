package com.bayri.rentacar.business.abstracts;

import com.bayri.rentacar.entities.concretes.Car;
import com.bayri.rentacar.entities.dtos.CarDetailsDto;

import java.util.List;

public interface CarService {
    void add(Car car);
    void update(Car car);
    void delete(Car car);
    List<Car> getAll();
    List<CarDetailsDto> getAllDto();
    CarDetailsDto getDto(int id);
    List<Car> getByBrand_IdAndColor_Id(int brandId, int colorId);
    List<Car> getByCarLocation_Id(int id);
    CarDetailsDto getLocationDto(int id);
    Car getById(int id);
}
