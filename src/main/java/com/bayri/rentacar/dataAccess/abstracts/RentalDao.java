package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RentalDao extends JpaRepository<Rental,Integer> {
    List<Rental> getByUser_Id(int id);
}
