package com.spring.boot.ehcache.demo.service;

import com.spring.boot.ehcache.demo.entity.User;
import com.spring.boot.ehcache.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationEvent;
import java.util.List;
import java.util.Optional;

/**
 * @author yy
 * @ProjectName ehcacheDemo
 * @Description: TODO
 * @date 2019/2/18 10:51
 */
@Service
@CacheConfig(cacheNames = "userCache")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    //value=ehcache.xml中的配置chcahe的name ,key=
    @Cacheable(value = "userCache")
    @Override
    public List<User> findAllUser() {
        System.out.println("执行了数据库操作");
        return userRepository.findAll();
    }
}
