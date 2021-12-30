package com.bayri.rentacar.business.abstracts;

import com.bayri.rentacar.entities.concretes.Rental;

import java.util.List;

public interface RentalService {
    void add(Rental rental);
    void update(Rental rental);
    void delete(Rental rental);
    List<Rental> getAll();
    List<Rental> getByUser_Id(int id);
}
