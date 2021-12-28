package com.bayri.rentacar.business.abstracts;


import com.bayri.rentacar.entities.concretes.CarLocation;

import java.util.List;

public interface CarLocationService {
    void add(CarLocation carLocation);
    void update(CarLocation carLocation);
    void delete(CarLocation carLocation);
    List<CarLocation> getAll();
}
