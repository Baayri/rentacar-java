package com.bayri.rentacar.dataAccess.abstracts;

import com.bayri.rentacar.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
