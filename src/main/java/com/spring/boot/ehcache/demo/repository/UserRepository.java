package com.spring.boot.ehcache.demo.repository;

import com.spring.boot.ehcache.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yy
 * @ProjectName ehcacheDemo
 * @Description: TODO
 * @date 2019/2/18 10:44
 */
public interface UserRepository extends JpaRepository<User,String> {
}
