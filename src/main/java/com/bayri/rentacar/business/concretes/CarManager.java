package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.CarService;
import com.bayri.rentacar.dataAccess.abstracts.CarDao;
import com.bayri.rentacar.entities.concretes.Car;
import com.bayri.rentacar.entities.dtos.CarDetailsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {

    private final CarDao carDao;

    public CarManager(CarDao carDao) {
        super();
        this.carDao = carDao;
    }

    @Override
    public void add(Car car) {
        this.carDao.save(car);
    }

    @Override
    public void update(Car car) {

    }

    @Override
    public void delete(Car car) {

    }

    @Override
    public List<Car> getAll() {
        return this.carDao.findAll();
    }

    @Override
    public List<CarDetailsDto> getAllDto() {
        return this.carDao.getAllDto();
    }

    @Override
    public CarDetailsDto getDto(int id) {
        return this.carDao.getDto(id);
    }

    @Override
    public Car getById(int id) {
        return this.carDao.getById(id);
    }
}
