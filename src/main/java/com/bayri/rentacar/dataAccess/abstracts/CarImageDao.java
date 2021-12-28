package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.CarImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarImageDao extends JpaRepository<CarImage,Integer> {
    CarImage getByCar_Id(int id);
}
