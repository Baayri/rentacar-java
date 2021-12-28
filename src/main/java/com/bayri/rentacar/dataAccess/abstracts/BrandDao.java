package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandDao extends JpaRepository<Brand,Integer> {
}
