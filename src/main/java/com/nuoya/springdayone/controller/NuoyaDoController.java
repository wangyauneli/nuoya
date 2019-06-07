package com.nuoya.springdayone.controller;

import com.nuoya.springdayone.entity.User;
import com.nuoya.springdayone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * NuoyaDoController class
 *
 * @author nuoya
 * @date 2018/12/6
 */
@Controller
@RequestMapping
public class NuoyaDoController {
    @Autowired
    private UserService srv;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(String name){
        List<User>  users=srv.findUsers();
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public List<User> getUsers(){
        List<User>  users=srv.findUsers();
        return users;
    }

}
