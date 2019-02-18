package com.spring.boot.ehcache.demo.controller;

import com.spring.boot.ehcache.demo.entity.User;
import com.spring.boot.ehcache.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yy
 * @ProjectName ehcacheDemo
 * @Description: TODO
 * @date 2019/2/18 11:30
 */
@RestController
@RequestMapping("/user")
public class UserController  {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll")
    public String finAllUser(){
        System.out.println(userService.toString());
        List<User> users  = userService.findAllUser();
        return users.toString();
    }

}
