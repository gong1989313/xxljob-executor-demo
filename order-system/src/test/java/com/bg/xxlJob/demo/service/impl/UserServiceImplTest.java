package com.bg.xxlJob.demo.service.impl;

import com.bg.xxlJob.demo.entity.UserEntity;
import com.bg.xxlJob.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelect(){
        UserEntity user = userService.selectById(1);
        assertEquals("password", user.getPassword());
    }

}