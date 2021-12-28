package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorDao extends JpaRepository<Color,Integer> {
}
