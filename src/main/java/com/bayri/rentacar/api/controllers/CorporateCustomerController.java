package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.CorporateCustomerService;
import com.bayri.rentacar.entities.concretes.CorporateCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/corporateCustomers")
@CrossOrigin
public class CorporateCustomerController {
    private final CorporateCustomerService corporateCustomerService;

    @Autowired
    public CorporateCustomerController(CorporateCustomerService corporateCustomerService) {
        super();
        this.corporateCustomerService = corporateCustomerService;
    }

    @PostMapping("/add")
    public void add(@RequestBody CorporateCustomer corporateCustomer){
        this.corporateCustomerService.add(corporateCustomer);
    }

    @GetMapping("/getAll")
    public List<CorporateCustomer> getAll(){
        return this.corporateCustomerService.getAll();
    }
}
