package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.CarLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarLocationDao extends JpaRepository<CarLocation,Integer> {
}
