package com.bayri.rentacar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "individual_customers")
@PrimaryKeyJoinColumn(name = "id")
public class IndividualCustomer extends User{
    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "phone_number")
    private String phoneNumber;
}
