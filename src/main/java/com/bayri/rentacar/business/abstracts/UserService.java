package com.bayri.rentacar.business.abstracts;

import com.bayri.rentacar.core.utilities.results.DataResult;
import com.bayri.rentacar.core.utilities.results.Result;
import com.bayri.rentacar.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAll();
    User getById(int id);
    DataResult<User> login(String email , String password);
}
