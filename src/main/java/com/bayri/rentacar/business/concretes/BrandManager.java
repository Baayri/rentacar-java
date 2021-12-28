package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.BrandService;
import com.bayri.rentacar.dataAccess.abstracts.BrandDao;
import com.bayri.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private final BrandDao brandDao;

    public BrandManager(BrandDao brandDao) {
        super();
        this.brandDao = brandDao;
    }

    @Override
    public void add(Brand brand) {
        this.brandDao.save(brand);
    }

    @Override
    public void update(Brand brand) {

    }

    @Override
    public void delete(Brand brand) {

    }

    @Override
    public List<Brand> getAll() {
        return this.brandDao.findAll();
    }
}
