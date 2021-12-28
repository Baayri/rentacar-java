package com.bayri.rentacar.api.controllers;

import com.bayri.rentacar.business.abstracts.UserService;
import com.bayri.rentacar.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping("/add")
    public void add(@RequestBody User user){
        this.userService.add(user);
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return this.userService.getAll();
    }
}
