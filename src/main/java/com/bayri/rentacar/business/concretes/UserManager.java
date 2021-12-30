package com.bayri.rentacar.business.concretes;

import com.bayri.rentacar.business.abstracts.UserService;
import com.bayri.rentacar.core.utilities.results.*;
import com.bayri.rentacar.dataAccess.abstracts.CorporateCustomerDao;
import com.bayri.rentacar.dataAccess.abstracts.IndividualCustomerDao;
import com.bayri.rentacar.dataAccess.abstracts.UserDao;
import com.bayri.rentacar.entities.concretes.CorporateCustomer;
import com.bayri.rentacar.entities.concretes.IndividualCustomer;
import com.bayri.rentacar.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private final UserDao userDao;
    private final IndividualCustomerDao individualCustomerDao;
    private final CorporateCustomerDao corporateCustomerDao;

    public UserManager(UserDao userDao, IndividualCustomerDao individualCustomerDao, CorporateCustomerDao corporateCustomerDao) {
        super();
        this.userDao = userDao;
        this.individualCustomerDao = individualCustomerDao;
        this.corporateCustomerDao = corporateCustomerDao;
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

    @Override
    public DataResult<User> login(String email , String password) {
        CorporateCustomer corporateCustomer = this.corporateCustomerDao.getByEmailAndPassword(email,password);
        IndividualCustomer individualCustomer= this.individualCustomerDao.getByEmailAndPassword(email,password);
        if (corporateCustomer != null){
            return new SuccessDataResult<User>(corporateCustomer,"Corporate");
        }
        else if (individualCustomer != null){
            return new SuccessDataResult<User>(individualCustomer,"Individual");
        }
        else {
            return new ErrorDataResult<User>("kullanıcı bulunamadı");
        }
    }
}
