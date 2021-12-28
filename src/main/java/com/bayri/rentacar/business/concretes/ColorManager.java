package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.ColorService;
import com.bayri.rentacar.dataAccess.abstracts.ColorDao;
import com.bayri.rentacar.entities.concretes.Color;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorManager implements ColorService {

    private final ColorDao colorDao;

    public ColorManager(ColorDao colorDao) {
        super();
        this.colorDao = colorDao;
    }

    @Override
    public void add(Color color) {
        this.colorDao.save(color);
    }

    @Override
    public void update(Color color) {

    }

    @Override
    public void delete(Color color) {

    }

    @Override
    public List<Color> getAll() {
        return this.colorDao.findAll();
    }
}
