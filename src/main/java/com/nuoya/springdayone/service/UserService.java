package com.nuoya.springdayone.service;


import com.nuoya.springdayone.dao.UserMapper;
import com.nuoya.springdayone.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper dao;

    public List<User>  findUsers(){
        return dao.selectAll();
    }

}
