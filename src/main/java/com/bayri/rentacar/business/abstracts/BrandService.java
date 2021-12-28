package com.bayri.rentacar.business.abstracts;

import com.bayri.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    void add(Brand brand);
    void update(Brand brand);
    void delete(Brand brand);
    List<Brand> getAll();
}
