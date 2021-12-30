package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualCustomerDao extends JpaRepository<IndividualCustomer,Integer> {
    IndividualCustomer getByEmailAndPassword(String email , String password);
}
