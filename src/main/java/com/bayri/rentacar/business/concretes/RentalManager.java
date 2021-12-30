package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.RentalService;
import com.bayri.rentacar.dataAccess.abstracts.RentalDao;
import com.bayri.rentacar.entities.concretes.Rental;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalManager implements RentalService {

    private final RentalDao rentalDao;

    public RentalManager(RentalDao rentalDao) {
        super();
        this.rentalDao = rentalDao;
    }

    @Override
    public void add(Rental rental) {
        this.rentalDao.save(rental);
    }

    @Override
    public void update(Rental rental) {

    }

    @Override
    public void delete(Rental rental) {

    }

    @Override
    public List<Rental> getAll() {
        return this.rentalDao.findAll();
    }

    @Override
    public List<Rental> getByUser_Id(int id) {
        return this.rentalDao.getByUser_Id(id);
    }

}
