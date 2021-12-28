package com.bayri.rentacar.business.abstracts;

import com.bayri.rentacar.entities.concretes.CorporateCustomer;

import java.util.List;

public interface CorporateCustomerService {
    void add(CorporateCustomer corporateCustomer);
    void update(CorporateCustomer corporateCustomer);
    void delete(CorporateCustomer corporateCustomer);
    List<CorporateCustomer> getAll();
}
