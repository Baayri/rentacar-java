package com.bayri.rentacar.business.abstracts;

import com.bayri.rentacar.entities.concretes.Color;

import java.util.List;

public interface ColorService {
    void add(Color color);
    void update(Color color);
    void delete(Color color);
    List<Color> getAll();
}
