package com.spring.boot.ehcache.demo.service;

import com.spring.boot.ehcache.demo.entity.User;

import java.util.List;

/**
 * @author yy
 * @ProjectName ehcacheDemo
 * @Description: TODO
 * @date 2019/2/18 11:12
 */
public interface UserService  {

     List<User> findAllUser();

}
