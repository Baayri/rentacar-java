package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.IndividualCustomerService;
import com.bayri.rentacar.dataAccess.abstracts.IndividualCustomerDao;
import com.bayri.rentacar.entities.concretes.IndividualCustomer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividualCustomerManager implements IndividualCustomerService {

    private final IndividualCustomerDao individualCustomerDao;

    public IndividualCustomerManager(IndividualCustomerDao individualCustomerDao) {
        super();
        this.individualCustomerDao = individualCustomerDao;
    }

    @Override
    public void add(IndividualCustomer individualCustomer) {
        this.individualCustomerDao.save(individualCustomer);
    }

    @Override
    public void update(IndividualCustomer individualCustomer) {

    }

    @Override
    public void delete(IndividualCustomer individualCustomer) {

    }

    @Override
    public List<IndividualCustomer> getAll() {
        return this.individualCustomerDao.findAll();
    }
}
