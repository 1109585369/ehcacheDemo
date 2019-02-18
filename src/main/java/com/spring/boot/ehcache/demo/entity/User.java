package com.spring.boot.ehcache.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yy
 * @ProjectName ehcacheDemo
 * @Description: TODO
 * @date 2019/2/18 10:38
 */
@Entity
@Table(name = "user")
public class User  {

    @Id
    private  String id ;

    private String create_at;

    private String name;

    private String password;

    private String username;


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", create_at='" + create_at + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
