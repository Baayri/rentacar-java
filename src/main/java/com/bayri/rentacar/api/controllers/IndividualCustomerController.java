package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.IndividualCustomerService;
import com.bayri.rentacar.entities.concretes.IndividualCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/individualCustomers")
@CrossOrigin
public class IndividualCustomerController {
    private final IndividualCustomerService individualCustomerService;

    @Autowired
    public IndividualCustomerController(IndividualCustomerService individualCustomerService) {
        super();
        this.individualCustomerService = individualCustomerService;
    }

    @PostMapping("/add")
    public void add(@RequestBody IndividualCustomer individualCustomer){
        this.individualCustomerService.add(individualCustomer);
    }

    @GetMapping("/getAll")
    public List<IndividualCustomer> getAll(){
        return this.individualCustomerService.getAll();
    }
}
