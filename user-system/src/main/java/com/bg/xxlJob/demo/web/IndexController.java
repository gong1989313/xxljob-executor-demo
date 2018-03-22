package com.bg.xxlJob.demo.web;

import com.bg.xxlJob.demo.entity.UserEntity;
import com.bg.xxlJob.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "测试", description = "测试请求")
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/ping")
    @ApiOperation(value = "ping测试", notes = "Get请求")
    public String ping(){
        return "pong";
    }

    @GetMapping("/user/add")
    @ApiOperation(value = "新增用户", notes = "Post请求")
    public boolean addUser(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setUsername("test");
        userEntity.setPassword("test");
        userEntity.setStatus("ON");
        return userService.insert(userEntity);
    }

    @GetMapping("/users")
    @ApiOperation(value = "查询用户列表", notes = "get请求")
    public List<UserEntity> getAll(){
        return userService.selectListBySQL();
    }
}
