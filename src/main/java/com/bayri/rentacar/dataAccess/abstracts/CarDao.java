package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.Car;
import com.bayri.rentacar.entities.dtos.CarDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarDao extends JpaRepository<Car,Integer> {
    Car getById(int id);

    @Query("select new com.bayri.rentacar.entities.dtos.CarDetailsDto" +
            "(car.id , car.brand.brandName,car.color.colorName,car.carLocation.location,car.modelYear,car.dailyPrice,car.description," +
            "ci.url) from Car car left join car.carImages ci")
    List<CarDetailsDto> getAllDto();

    @Query("select new com.bayri.rentacar.entities.dtos.CarDetailsDto" +
            "(car.id , car.brand.brandName,car.color.colorName,car.carLocation.location,car.modelYear,car.dailyPrice,car.description," +
            "ci.url) from Car car left join car.carImages ci where car.id = :id")
    CarDetailsDto getDto(int id);

    @Query("select new com.bayri.rentacar.entities.dtos.CarDetailsDto" +
            "(car.id , car.brand.brandName,car.color.colorName,car.carLocation.location,car.modelYear,car.dailyPrice,car.description," +
            "ci.url) from Car car left join car.carImages ci where car.carLocation.id = :id")
    CarDetailsDto getLocationDto(int id);

    List<Car> getByBrand_IdAndColor_Id(int brandId,int colorId);

    List<Car> getByCarLocation_Id(int id);
}
