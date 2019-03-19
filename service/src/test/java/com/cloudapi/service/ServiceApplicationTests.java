package com.cloudapi.service;

import com.luolj.dao.UserDAO;
import com.luolj.entity.User;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
//@MapperScan("com.luolj.dao")
public class ServiceApplicationTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void insertUser(){
        ArrayList<User> list =new ArrayList<>();
        list.add(new User("testaaa",5,new Date()));
        userDAO.insertUser(list);
    }

    @Test
    public void contextLoads() {
    }

}
