package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateCustomerDao extends JpaRepository<CorporateCustomer,Integer> {
    CorporateCustomer getByEmailAndPassword(String email , String password);
}
