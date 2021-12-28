package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.CorporateCustomerService;
import com.bayri.rentacar.dataAccess.abstracts.CorporateCustomerDao;
import com.bayri.rentacar.entities.concretes.CorporateCustomer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorporateCustomerManager implements CorporateCustomerService {

    private final CorporateCustomerDao corporateCustomerDao;

    public CorporateCustomerManager(CorporateCustomerDao corporateCustomerDao) {
        super();
        this.corporateCustomerDao = corporateCustomerDao;
    }

    @Override
    public void add(CorporateCustomer corporateCustomer) {
        this.corporateCustomerDao.save(corporateCustomer);
    }

    @Override
    public void update(CorporateCustomer corporateCustomer) {

    }

    @Override
    public void delete(CorporateCustomer corporateCustomer) {

    }

    @Override
    public List<CorporateCustomer> getAll() {
        return this.corporateCustomerDao.findAll();
    }
}
