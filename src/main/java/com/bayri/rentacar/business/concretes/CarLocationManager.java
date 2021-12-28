package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.CarLocationService;
import com.bayri.rentacar.dataAccess.abstracts.CarLocationDao;
import com.bayri.rentacar.entities.concretes.CarLocation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarLocationManager implements CarLocationService {

    private final CarLocationDao carLocationDao;

    public CarLocationManager(CarLocationDao carLocationDao) {
        super();
        this.carLocationDao = carLocationDao;
    }

    @Override
    public void add(CarLocation carLocation) {
        this.carLocationDao.save(carLocation);
    }

    @Override
    public void update(CarLocation carLocation) {

    }

    @Override
    public void delete(CarLocation carLocation) {

    }

    @Override
    public List<CarLocation> getAll() {
        return this.carLocationDao.findAll();
    }
}
