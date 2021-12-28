package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.UserService;
import com.bayri.rentacar.dataAccess.abstracts.UserDao;
import com.bayri.rentacar.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private final UserDao userDao;

    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        this.userDao.save(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {
        this.userDao.delete(user);
    }

    @Override
    public List<User> getAll() {
        return this.userDao.findAll();
    }
}
