package com.bayri.rentacar.business.abstracts;

import com.bayri.rentacar.entities.concretes.IndividualCustomer;

import java.util.List;

public interface IndividualCustomerService {
    void add(IndividualCustomer individualCustomer);
    void update(IndividualCustomer individualCustomer);
    void delete(IndividualCustomer individualCustomer);
    List<IndividualCustomer> getAll();
}
