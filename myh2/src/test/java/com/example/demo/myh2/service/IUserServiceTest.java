package com.example.demo.myh2.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.myh2.Application;
import com.example.demo.myh2.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class IUserServiceTest {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    IUserService userService;

    @Test
    public void queryAll(){
        List<User> users = userService.selectList(new EntityWrapper<>());
        log.info("users: {}", users);
    }

    @Test
    public void findByName(){
        List<User> users = userService.selectList(new EntityWrapper<>());
        log.info("user: {}", users);
    }
}